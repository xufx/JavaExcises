package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
 enum Spiciness
        {
            NOT,MILD,MEDIUM,HOT,FLAMING
        }
public class SimpleEnumUse
{
    public static void main(String[] args)
    {
        Spiciness howpot=Spiciness.MEDIUM;
        System.out.println(howpot);

        for (Spiciness s:Spiciness.values())
        {
            System.out.println(s+".ordinal:"+s.ordinal());
        }
    }
}
