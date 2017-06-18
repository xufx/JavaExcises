package holding;
import java.util.*;
/**
 * Created by Administrator on 2017/6/18.
 */
class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference
{
    public static void main(String[] args)
    {
        List<Snow> snow1= Arrays.asList
                ( new Crusty(),new Slush(),new Power()
                );
        List<Snow> snow2= Arrays.asList
                ( new Light(),new Heavy()
                );
        Collections.addAll(snow2);
        List<Snow> snow3= new ArrayList<Snow>();
               Collections.addAll(snow3,new Light(),new Heavy());
        List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
