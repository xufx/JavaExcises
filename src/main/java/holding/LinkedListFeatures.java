package holding;
import java.util.LinkedList;
/**练习LinkedList
 * Created by Administrator on 2017/6/21.
 */
import typeinfo.pets.*;
import static net.mindview.util.Print.*;
public class LinkedListFeatures
{
    public static void main(String[] args)
    {
        LinkedList<Pet> pets=new LinkedList<Pet>(Pets.arrayList(5));
        print(pets);
        print("pets.getFirst():"+pets.getFirst());
        print(pets.element());
        print(pets.peek());
        print("pets.remove():"+pets.remove());
        print("pets.removeFirst():"+pets.removeFirst());
        print(" pets.poll():"+ pets.poll());
        print(pets);

        pets.addFirst(new Rat());
        print("after addFirst:"+pets);

        pets.offer(Pets.randomPet());
        print("after offer"+pets);

        pets.add(Pets.randomPet());
        print("after add"+pets);

        pets.addLast(new Hamster());
        print("after addLast()"+pets);
        print("pets.removeLast():"+pets.removeLast());
    }
}
