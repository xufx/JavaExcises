package commonErrors;
import java.io.Serializable;
/**
 * Created by xufuxiu on 2017/9/17.
 */
public class Car implements Serializable
{
    private static final long serialVersionUID=-5713945027627603702L;
    private String brand;
    private int maxSpeed;
    public Car(String brand, int maxSpeed)
    {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString()
    {
        return "brand="+brand+",maxSpeed="+maxSpeed;
    }
}
