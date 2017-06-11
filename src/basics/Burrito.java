package basics;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Burrito
{
    Spiciness degree;

    public Burrito(Spiciness degree)
    {
        this.degree = degree;
    }
    public void descibe()
    {
        System.out.println("this burrito is");
        switch (degree)
        {
            case NOT:System.out.println("not spicy at all");break;
            case MILD:
            case MEDIUM:System.out.println("a little hot");break;
            case HOT:
            case FLAMING:
                default:System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args)
    {
        Burrito
                plain=new Burrito(Spiciness.NOT),
                greenChile=new Burrito(Spiciness.MEDIUM),
                jalapeno=new Burrito(Spiciness.HOT);
        plain.descibe();
        greenChile.descibe();
        jalapeno.descibe();
    }
}
