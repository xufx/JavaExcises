package holding;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2017/6/18.
 */
public class Gerbil
{
    int gerbiNumber;
    public Gerbil(int gerbiNumber)
    {
        this.gerbiNumber = gerbiNumber;
    }
    public void hop()
    {
        System.out.println(gerbiNumber);
    }
    public static void main(String[] args)
    {
        ArrayList<Gerbil> gers=new ArrayList<Gerbil>();
        for (int i = 1000; i < 1005; i++)
        {
            gers.add(new Gerbil(i));
        }
        for (int i = 0; i <gers.size() ; i++)
        {
            //gers.get(i).hop();
        }
        for(Gerbil g:gers)
        {
            g.hop();
        }

    }
}
