package typeinfo.pets;
import holding.MapOfList;

import java.util.*;
/**
 * Created by Administrator on 2017/6/28.
 */
public class IndividualTest
{
    public static void main(String[] args)
    {
        Set<Individual> pets=new TreeSet<>();
        for (List<? extends Pet> lp: MapOfList.petPeople.values())
            for (Pet p:lp)
                pets.add(p);
        System.out.println(pets);
    }
}
