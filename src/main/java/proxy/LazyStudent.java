package proxy;
/**
 * Created by xufuxiu on 2017/9/20.
 */
public class LazyStudent implements Candidate
{
    private String name;
    public LazyStudent(String name)
    {
        this.name = name;
    }
    @Override
    public void answerTheQuestions()
    { // 懒学生只能写出自己的名字不会答题
        System.out.println("姓名："+name);
    }
}
