package holding;
import java.util.*;

import typeinfo.pets.*;
import static  net.mindview.util.Print.*;
/**跟踪拥有多个宠物的人
 * Created by Administrator on 2017/6/22.
 */
public class MapOfList
{
    public static Map<Person,List<? extends Pet>> petPeople=
            new HashMap<Person,List<? extends Pet>>();
    static
    {//乱序存放
        petPeople.put
                (new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"),new Mutt("Spot"))
                );
        petPeople.put
                (new Person("Kate"),
                        Arrays.asList(new Cymric("Molly"),new Mutt("Spot"))
                );

        petPeople.put
                (new Person("Marilyn"),
                        Arrays.asList(new Pug("Louie aka Louis Sborekelstein Dupree"),
                                new Cat("Stanford aka Stinky el Negro"),
                                new Cat("Pinkola"))
                );
        petPeople.put
                (new Person("Luke"),
                        Arrays.asList(new Rat("Fuzzy"),new Mutt("Fizzy"))
                );
        petPeople.put
                (new Person("Isaac"),
                        Arrays.asList(new Rat("Freckly"))
                );
    }
    public static void main(String[] args)
    {
        print(petPeople);
        print("people:"+petPeople.keySet());
        print("Pets:"+petPeople.values());
        for(Person person:petPeople.keySet())
        {
            print(person+" has");
            for(Pet pet:petPeople.get(person))
                print("  "+pet);
        }
    }
}
