package holding;
import net.mindview.util.Stack;
/**用栈计算表达式的值
 * Created by Administrator on 2017/6/21.
 */
public class StackTest
{
    public static void main(String[] args)
    {
        Stack <String> stack=new Stack<String>();
        for(String s:"My dog has fleas".split(" "))stack.push(s);
        while (!stack.empty()) System.out.println(stack.pop()+" ");
    }
}
class StackTest2
{
    public static void main(String[] args)
    {
        Stack <Character> stack=new Stack<Character>();
        String str="+U+n+c---+e+r+t---+a+i+n+t+y---+r+u---+l+e+s---";
        for (int i = 0; i <str.length() ; i++)
        {
            char c=str.charAt(i);
            switch (c)
            {
                case '+':stack.push(str.charAt(i+1));i++;break;
                case '-':System.out.println("弹出栈顶元素："+stack.pop());break;
                default:break;
            }
        }
        System.out.println(stack);
    }

}