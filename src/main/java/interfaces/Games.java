package interfaces;
/**工厂设计模式，在相同的棋盘上下国际象棋和西洋跳棋
 * Created by Administrator on 2017/6/13.
 */
interface Game
{
    boolean move();
}
interface GameFactory
{
    Game getGame();
}
class Checkers implements Game
{
    private int moves=0;
    private static final int MOVES=3;
    @Override
    public boolean move()
    {
        System.out.println("Checker's move"+moves);
        return ++moves !=MOVES;
    }
}
class CheckersFactory implements GameFactory
{
    @Override
    public Game getGame()
    {
        return new Checkers();
    }
}
class Chess implements Game
{
    private int moves=0;
    private static final int MOVES=4;
    @Override
    public boolean move()
    {
        System.out.println("Chess move"+moves);
        return ++moves !=MOVES;
    }

}
class ChessFactory implements GameFactory
{
    @Override
    public Game getGame()
    {
        return new Chess();
    }
}

public class Games
{
    public static void playGame(GameFactory factory)
    {
        Game s=factory.getGame();
        while (s.move())
        {

        }
    }
    public static void main(String[] args)
    {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
