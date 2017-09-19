package strings;
import static util.Common.sy;
/**实现字符串反转的几种方式
 * Created by xufuxiu on 2017/9/17.
 */
public class JdkReverser implements Reverser
{
    @Override
    public String reverse(String str)
    {/*1：StringBuffer*/
        if ((null==str)||(str.length()<=1))
        {
            return str;
        }
        return new StringBuffer(str).reverse().toString();
    }
    public String reverse1(String s)
    {/*二分递归将后面的字符和前面的字符连接起来*/
    int length=s.length();
        if (length<=1)return s;
        String left=s.substring(0,length/2);
        String right=s.substring(length/2,length);
        return reverse1(right)+reverse1(left);
    }
    public String reverse2(String s)
    {/*取得当前字符并和之前的字符append起来*/
        int length=s.length();
        String re="";
        for (int i = 0; i <length ; i++)
        {
            re=s.charAt(i)+re;
        }
        return re;
    }
    public String reverse3(String s)
    {/*将字符从后往前append起来*/
        int length=s.length();
        String re="";
        for (int i = length-1; i >=0 ; i--)
        {
            re=re+s.charAt(i);
        }
        return re;
    }
    public String reverse4(String s)
    {/*将后面的字符和前面的那个字符交换*/
        char[] array=s.toCharArray();
        int end=s.length()-1;
        int halfLength=end/2;
        for (int i = 0; i <=halfLength ; i++)
        {
            char temp=array[i];
            array[i]=array[end-1];
            array[end-1]=temp;
        }
        return new String(array);
    }
    public String reverse5(String s)
    {/**
     使用异或交换字符串
     a=a^b,b=b^a
     */
        char[] array=s.toCharArray();
        int begin=0;
        int end=s.length()-1;
       while (begin<end)
       {
           array[begin]=(char)(array[begin]^array[end]);
           array[end] = (char) (array[end] ^ array[begin]);
           array[begin] = (char) (array[end] ^ array[begin]);
           begin++;
           end--;
       }
        return new String(array);
    }

    public static void main(String[] args)
    {
        JdkReverser j=new JdkReverser();
        String s="abc";
        sy(s);
        //sy(j.reverse(s));
        //sy(j.reverse1(s));
        //sy(j.reverse2(s));
        //sy(j.reverse3(s));
        //sy(j.reverse4(s));
        sy(j.reverse5(s));
    }
}
