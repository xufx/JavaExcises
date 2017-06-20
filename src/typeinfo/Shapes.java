package typeinfo;
import javafx.scene.transform.Rotate;

import java.util.Arrays;
import java.util.List;
/**
 * Created by Administrator on 2017/6/18.
 */
abstract class Shape
{
    void draw(){System.out.println(this+".draw()");}
    abstract public String toString();
}
class Circle extends Shape
{
    @Override
    public String toString()
    {
        return "Circle";
    }
}
class Square extends Shape
{
    @Override
    public String toString()
    {
        return "Square";
    }
}
class Triangle extends Shape
{
    @Override
    public String toString()
    {
        return "Triangle";
    }
}
class Rhomboid extends Shape
{
    public String toString()
    {
        return "Rhomboid";
    }
}
public class Shapes
{
    public static void Rotate(Shape s)
    {
        if (s instanceof Circle)System.exit(1);
    }
    public static void main(String[] args)
    {//将Circle、Square、Triangle等向上转型为Object，再Object转型为Shape
        List<Shape> shapeList= Arrays.asList(new Circle(),new Square(),new Triangle(),new Rhomboid());

        for(Shape shape:shapeList)
        {
            //shape.draw();//多态
            //Rotate(shape);
            System.out.println(shape);

        }
    }
}
