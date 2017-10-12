package proxy;
/**枪手
 * Created by xufuxiu on 2017/9/20.
 */
public class Gunman implements Candidate
{
    private Candidate target;//代理对象
    public Gunman(Candidate target)
    {
        this.target = target;
    }
    @Override
    public void answerTheQuestions()
    {   // 枪手要写上代考的学生的姓名
        target.answerTheQuestions();
        // 枪手要帮助懒学生答题并交卷
        System.out.println("奋笔疾书正确答案");
        System.out.println("交卷");
    }
}
