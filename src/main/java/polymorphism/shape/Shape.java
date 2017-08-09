package polymorphism.shape;


import java.util.Random;
/**练习向上转型
 * Created by Administrator on 2017/6/12.
 */
public class Shape
{
    public void draw(){System.out.println("Shape.draw()");}
    public void erase(){System.out.println("Shape.erase()");}
    private static RandomShapeGenerator gen=new RandomShapeGenerator();
    public void expand(){System.out.println("Shape.expand()");}
    public static void main(String[] args)
    {

        Shape[] s=new Shape[9];
        for (int i = 0; i <s.length ; i++){s[i]=gen.next();}

            for(Shape shp:s){shp.draw();shp.expand();}


    }
}
class Circle extends Shape
{
    public void draw(){System.out.println("Circle.draw()");}
    public void erase(){System.out.println("Circle.erase()");}
}
class Square extends Shape
{
    public void draw(){System.out.println("Square.draw()");}
    public void erase(){System.out.println("Square.erase()");}
}
class Triangle extends Shape
{
    public void draw(){System.out.println("Triangle.draw()");}
    public void erase(){System.out.println("Triangle.erase()");}
}
 class RandomShapeGenerator
{//RandomShapeGenerator是一种工厂，每次调用next（）就产生一个Shape对象的引用
    private Random rand=new Random(47);
    public Shape next()
    {
        switch (rand.nextInt(3))
        {
            default:
            case 0:return new Circle();//向上转型，以Shape类型发送出去，所以不知道里面的具体类型
            case 1:return new Square();//向上转型
            case 2:return new Triangle();//向上转型
        }
    }
}
