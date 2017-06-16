package interfaces;
/**
 * Created by Administrator on 2017/6/13.
 */
interface CanClimb
{
    void canClimb();
}
interface CanClimbWall extends CanClimb
{
    void canClimbWall();
}
interface CanClimbTree extends CanClimb
{
    void canClimbTree();
}
interface CanClimbAppleTree extends CanClimbTree
{
    void canClimbAppleTree();
}
public class CanClimbTest implements CanClimbAppleTree
{
    @Override
    public void canClimbAppleTree()
    {
        System.out.println("canClimbAppleTree");
    }
    @Override
    public void canClimbTree()
    {
        System.out.println("canClimbTree");
    }
    public void canClimb()
    {
        System.out.println("canClimb");
    }
    public static void main(String[] args)
    {
        CanClimbTest c=new CanClimbTest();
        c.canClimbAppleTree();
    }

}
