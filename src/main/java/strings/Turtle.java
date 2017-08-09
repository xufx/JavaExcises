package strings;
import java.io.PrintStream;
import java.util.Formatter;
/**
 * Created by Administrator on 2017/6/24.
 */
public class Turtle
{
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f)
    {
        this.name = name;
        this.f = f;
    }
    public void move(int x,int y)
    {
        f.format("%s the turtle is at (%d,%d)\n",name,x,y);
    }
    public static void main(String[] args)
    {
        PrintStream outAlias=System.out;
        //所有tommy都将输出到System.out
        Turtle tommy=new Turtle("Tommy",new Formatter(System.out));
        //Turtle tommy=new Turtle("Tommy",new Formatter(System.err));
        //所有terry都将输出到System.out的一个别名中
        Turtle terry=new Turtle("Terry",new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}
