package access;

import access.desert.Cookie;

/**
 * Created by Administrator on 2017/6/10.
 */
public class ChocolateChip extends Cookie
{
    public ChocolateChip()
    {
        System.out.println("ChocolateChip constructor");
    }
    public void chomp(){}

    public static void main(String[] args)
    {
        ChocolateChip x=new ChocolateChip();
        x.chomp();
    }
}
