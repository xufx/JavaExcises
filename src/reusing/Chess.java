package reusing;
import access.ChocolateChip;
/**
 * Created by Administrator on 2017/6/11.
 */
class Game
{
    public Game(int i)
    {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game
{
    public BoardGame(int i)
    {
        super(i);
       System.out.println("BoardGame constructor");
    }
}
public class Chess extends BoardGame
{
    public Chess()
    {
        super(11);
        System.out.println("chess constructor");
    }
    public static void main(String[] args)
    {
        Chess x=new Chess();
    }
}
