package holding;
import java.util.*;
/**List练习
 * Created by Administrator on 2017/6/18.
 */
import sun.security.ssl.HandshakeOutStream;
import typeinfo.pets.*;
import static net.mindview.util.Print.*;
public class ListFeatures
{
    public static void main(String[] args) throws Exception
    {
        Random rand=new Random(47);
       List<Pet> pets=Pets.arrayList(7);
        System.out.println("1:"+pets);

        Hamster h=new Hamster();
        pets.add(h);
        print("2:"+pets);
        print("3:"+pets.contains(h));//true

        pets.remove(h);
        Pet p=pets.get(2);
        print("4:"+p+" "+pets.indexOf(p));
        Pet cymric=new Cymric();
        print("5:"+pets.indexOf(cymric)); //Cymric继承Manx ，返回的是manx的index
        print("6:"+pets.remove(cymric));
        print("7:"+pets.remove(p));
        print("8:"+pets);

        pets.add(3,new Mouse());
        print("9:"+pets);
        List<Pet> sub=pets.subList(1,4);
        print("sublist:"+sub);
        print("10："+pets.containsAll(sub));
        Collections.sort(sub);//按字母进行排序
        print("sorted sublist:"+sub);
        print("11："+pets.containsAll(sub));

        Collections.shuffle(sub,rand);//mix it up
        print("shuffled sublist:"+sub);
        print("12："+pets.containsAll(sub));

        List<Pet>copy=new ArrayList<Pet>(pets);
        sub=Arrays.asList(pets.get(1),pets.get(4));
        print("sub:"+sub);

        copy.retainAll(sub);
        print("13:"+copy);

        copy.remove(2);
        print("14:"+copy);
/*

        copy.removeAll(sub);
        print("15:"+copy);
*/


        copy.set(1,new Mouse());
        print("16:"+copy);


        copy.addAll(2,sub);
        print("17:"+copy);
        print("18:"+pets.isEmpty());
        pets.clear();
        print("19:"+copy);
        print("20:"+pets.isEmpty());

        pets.addAll(Pets.arrayList(4));
        print("21:"+pets);
        Object[] o=pets.toArray();//将序列转化为对象数组
        print("22:"+o[3]);

        Pet[] pa=pets.toArray(new Pet[0]);//将序列转化为对象数组
        print("23:"+pa[3].id());
    }
}
