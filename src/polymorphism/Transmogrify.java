package polymorphism;
/**
 * Created by Administrator on 2017/6/12.
 */
class Actor
{
    public void act(){System.out.println("Actor");}
}
class HappyActor extends Actor
{
    public void act(){System.out.println("happyActor");}
}
class SadActor extends Actor
{
    public void act(){System.out.println("SadActor");}
}
class Stage
{//通过组合使状态发生变化
    private Actor actor=new HappyActor();
    public void change()
    {
        actor=new SadActor();
    }
    public void performPlay(){actor.act();}
}

public class Transmogrify
{
    public static void main(String[] args)
    {
        Stage stage=new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
