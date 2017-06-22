package holding;
/**
 * Created by Administrator on 2017/6/21.
 */
public class StackCollision
{
    public static void main(String[] args)
    {
        net.mindview.util.Stack<String>stack=
                new net.mindview.util.Stack<String>();
        for(String s:"My dog has fleas".split(" "))stack.push(s);
        while (!stack.empty()) System.out.println(stack.pop()+" ");
        System.out.println();

        java.util.Stack<String>stack2=
                new java.util.Stack<String>();
        for(String s:"My dog has fleas".split(" "))stack.push(s);
        while (!stack.empty()) System.out.println(stack.pop()+" ");
    }
}
