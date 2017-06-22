package holding;
import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.print;
/**
 * List练习
 * Created by Administrator on 2017/6/18.
 */
public class ListFeatures2
{
    public static void main(String[] args) throws Exception
    {
        Random rand=new Random(47);
       List<Integer> pets=new ArrayList<Integer>();
        System.out.println("1:"+pets);

        pets.add(1);
        pets.add(2);
        pets.add(3);
        pets.add(4);
        print("2:"+pets);
        print("3:"+pets.contains(1));//true

        pets.remove(1);
        Integer p=pets.get(2);
        print("4:"+p+" "+pets.indexOf(p));

        print("5:"+pets.indexOf(3)); //Cymric继承Manx ，返回的是manx的index
        print("6:"+pets.remove(2));
        print("7:"+pets.remove(p));
        print("8:"+pets);

        pets.add(2,new Integer(10));
        print("9:"+pets);
        List<Integer> sub=pets.subList(1,2);
        print("sublist:"+sub);
        print("10："+pets.containsAll(sub));
        Collections.sort(sub);//按字母进行排序
        print("sorted sublist:"+sub);
        print("11："+pets.containsAll(sub));

        Collections.shuffle(sub,rand);//mix it up
        print("shuffled sublist:"+sub);
        print("12："+pets.containsAll(sub));

        List<Integer>copy=new ArrayList<Integer>(pets);
        sub=Arrays.asList(pets.get(1),pets.get(2));
        print("sub:"+sub);

        copy.retainAll(sub);
        print("13:"+copy);

        copy.remove(1);
        print("14:"+copy);
/*

        copy.removeAll(sub);
        print("15:"+copy);
*/


        copy.set(0,new Integer(20));
        print("16:"+copy);


        copy.addAll(1,sub);
        print("17:"+copy);
        print("18:"+pets.isEmpty());
        pets.clear();
        print("19:"+copy);
        print("20:"+pets.isEmpty());

        pets.addAll(new ArrayList<Integer>(copy));
        print("21:"+pets);
        Object[] o=copy.toArray();//将序列转化为对象数组
        print("22:"+o[3]);

        Integer[] pa=copy.toArray(new Integer[0]);//将序列转化为对象数组
    }
}
