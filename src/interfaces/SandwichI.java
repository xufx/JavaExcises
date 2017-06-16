package interfaces;
/**
 * Created by Administrator on 2017/6/13.
 */
interface FastFood
{
    void Meal();
    void Bread();
    void Cheese();
    void Lettuce();
}

public class SandwichI implements FastFood
{
    public void  Meal()
    {
        System.out.println("Meal()");
    }
    public void  Bread()
    {
        System.out.println("Bread()");
    }
    public void  Cheese()

    {
        System.out.println("Cheese()");
    }
    public void  Lettuce()
    {
        System.out.println("Lettuce()");
    }
}
