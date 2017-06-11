package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */
public class SpaceShipControls
{
    void up(int velocity){System.out.println("up");}
    void down(int velocity){System.out.println("down");}
    void left(int velocity){System.out.println("left");}
    void right(int velocity){System.out.println("right");}
    void forward(int velocity){System.out.println("SpaceShipControls forward");}
    void back(int velocity){System.out.println("back");}
    void turboBoost(int velocity){System.out.println("turboBoost");}
}
class SpaceShip extends SpaceShipControls
{
    private String name;
    public SpaceShip(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return name;
    }
    public static void main(String[] args)
    {
        SpaceShip protector=new SpaceShip("NSEA Protector");
        protector.forward(100);
        protector.up(100);
    }
}
