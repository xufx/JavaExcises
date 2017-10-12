package proxy;
/**
 * Created by xufuxiu on 2017/9/20.
 */
public class ProxyTest1
{
    public static void main(String[] args)
    {
        Candidate c=new Gunman(new LazyStudent("王二"));
        c.answerTheQuestions();
    }
}
