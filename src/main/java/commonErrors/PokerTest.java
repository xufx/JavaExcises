package commonErrors;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/17.
 */
public class PokerTest
{
    public static void main(String[] args)
    {
        Poker poker=new Poker();
        poker.shuffle();
        Poker.Card c1=poker.deal(0);//发第一张牌
        Poker.Card c2=poker.new Card("红心",1);//自己创建一张牌
        sy("c1:"+c1);
        sy("c2:"+c2);
    }
}
