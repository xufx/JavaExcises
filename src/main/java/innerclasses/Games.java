package innerclasses;
/**
 * Created by Administrator on 2017/6/15.
 */
interface Game
{
    boolean move();
}
interface GameFactory
{
    Game getGame();
}
class Chekers implements Game
{
    private Chekers()
    {
    }
    private int moves=0;
    private static final int MOVES=3;
    @Override
    public boolean move()
    {
        System.out.println("chekers move"+moves);
        return ++moves==MOVES;
    }
    public static GameFactory factory=new GameFactory()
    {
        @Override
        public Game getGame()
        {
            return new Chekers();
        }
    };
}
class Chess implements Game
{
    private Chess()
    {
    }
    private int moves=0;
    private static final int MOVES=4;
    @Override
    public boolean move()
    {
        System.out.println("chess move"+moves);
        return ++moves!=MOVES;
    }
    public static GameFactory factory=new GameFactory()
    {
        @Override
        public Game getGame()
        {
            return new Chess();
        }
    };
}
public class Games
{
    public static void playGame(GameFactory factory)
    {
        Game s=factory.getGame();
        while (s.move())
        {}
    }
    public static void main(String[] args)
    {
        playGame(Chekers.factory);
    }
}
