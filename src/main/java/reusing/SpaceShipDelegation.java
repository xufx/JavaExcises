package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */
public class SpaceShipDelegation
{
    public String name;
    private SpaceShipControls controls=new SpaceShipControls();
    public SpaceShipDelegation(String name)
    {
        this.name = name;
    }
    //Delegated methods
    public void up(int velocity)
    {System.out.println("up");controls.up(velocity);}
    public void down(int velocity)
    {System.out.println("down");controls.down(velocity);}
    public void left(int velocity)
    {System.out.println("left");controls.left(velocity);}
    public void right(int velocity)
    {System.out.println("right");controls.right(velocity);}
    public void forward(int velocity)
    {
        System.out.println("SpaceShipDelegation forward");
        controls.forward(velocity);
    }
    public void back(int velocity)
    {System.out.println("back");controls.back(velocity);}
    public void turboBoost(int velocity)
    {System.out.println("turboBoost");controls.turboBoost(velocity);}
    public static void main(String[] args)
    {
        SpaceShipDelegation protector=new SpaceShipDelegation("NESE Protector");
        protector.forward(100);
    }
}
