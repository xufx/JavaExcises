package typeinfo;
import net.mindview.util.Print;

import java.util.Arrays;
import java.util.List;
/**
 * Created by Administrator on 2017/6/20.
 */
/*实现了接口Robot中的name(),model(),operations()方法*/
public class SnowRemovalRobot implements Robot
{
    private String name;
    public SnowRemovalRobot(String name)
    {
        this.name = name;
    }
    @Override
    public String name()
    {
        return name;
    }
    @Override
    public String model()
    {
        return "SnowBot Series l1";
    }
    /*返回一个序列，序列里存储的是Operation对象，具有description（），command（）方法*/
    public List<Operation> operations()
    {
        return Arrays.asList(
                new Operation()
        {//创建对象时实现其方法，可以实时调用，每个对象具有不同的方法
            public String description()
            {
                return name + " shovel snow";
            }
            @Override
            public void command()
            {
                System.out.println(name + " shoveling snow");
            }
        },
                new Operation()
        {
            public String description()
            {
                return name + " can chip ice";
            }
            @Override
            public void command()
            {
                System.out.println(name + " chipping ice");
            }
        },
                new Operation()
                {
                    public String description()
                    {
                        return name + " can clear the roof";
                    }
                    @Override
                    public void command()
                    {
                        System.out.println(name + " clearing roof");
                    }
                }
        );
    }
    public static void main(String[] args)
    {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
