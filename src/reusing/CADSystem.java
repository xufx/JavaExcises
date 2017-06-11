package reusing;
//覆盖，参数个数不同覆盖
/**
 * Created by Administrator on 2017/6/11.
 * */
class Shape
{
    public Shape(int i)
    {
        System.out.println("shape constructor");
    }
    void dispose(){System.out.println("shape dispose");}
}
class Circle extends Shape
{
    public Circle(int i)
    {
        super(i);
        System.out.println("Drawing circle");
    }
    @Override
    void dispose()
    {
        System.out.println("erasing circle");
        super.dispose();
    }
}
class Triangle extends Shape
{
    public Triangle(int i)
    {
        super(i);
        System.out.println("Drawing Triangle");
    }
    @Override
    void dispose()
    {
        System.out.println("erasing Triangle");
        super.dispose();
    }
}
class Line extends Shape
{
    private int start,end;
    public Line(int start, int end)
    {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing line:"+start+","+end);
    }

    @Override
    void dispose()
    {
        System.out.println("erasing Line:"+start+","+end);
        super.dispose();
    }
}
public class CADSystem extends Shape
{
    private Circle c;
    private Triangle t;
    private Line[] lines=new Line[3];
    public CADSystem(int i)
    {
        super(i+1);
        for (int j = 0; j <lines.length ; j++)
        {
            lines[j]=new Line(j,j*j);
            c=new Circle(1);
            t=new Triangle(1);
            System.out.println("combined constructor");
        }
    }
    @Override
    void dispose()
    {
        t.dispose();
        c.dispose();
        for (int i = lines.length-1; i >=0 ; i--)
        {
            lines[i].dispose();
        }
        super.dispose();
    }
    public static void main(String[] args)
    {
        CADSystem x=new CADSystem(47);
        try
        { }finally
        {
            x.dispose();
        }
    }
}
