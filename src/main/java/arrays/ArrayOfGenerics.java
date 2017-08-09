package arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LoggingPermission;
/**
 * Created by Administrator on 2017/6/26.
 */
public class ArrayOfGenerics
{
    public static void main(String[] args)
    {
        List<String>[] ls;
        List[] la=new List[10];
        ls=(List<String>[])la;
        ls[0]=new ArrayList<>();

        Object[] objects=ls;
        objects[1]=new ArrayList<Integer>();

        List<BerylliumSphere>[] spheres=
                (List<BerylliumSphere>[])new List[10];
        for (int i = 0; i <spheres.length ; i++)
        {
            spheres[i]=new ArrayList<BerylliumSphere>();
        }
        System.out.println(ls.toString());
        System.out.println(la.toString());
        System.out.println(spheres);
    }
}
