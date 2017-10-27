package main.java.excises.yixun;
/**
 * Created by xufuxiu on 2017/10/24.
 */
public class Ball implements Rollable
{
    private String name;
    public Ball(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public void play()
    {
        //ball默认是public static final的，不能被改变
        //ball=new Ball("basketball");
        System.out.println(ball.getName());
    }
}
