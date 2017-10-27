package main.java.innerclasses;
/**
 * Created by xufuxiu on 2017/10/25.
 */
public class Outer
{
    int out_x=0;
    public  void method()
    {
        Inner1 inner1=new Inner1();
        class Inner2
        {
            public void method()
            {
                out_x=3;
            }
        }
        Inner2 inner2=new Inner2();
    }
    class Inner1{}
    public static void main(String[] args)
    {
      System.out.println(new Outer().test());
        Outer t=new Outer();
        int b=t.get();
        System.out.println(b);
        //System.out.println(new Outer().test2());
    }
    public int get()
    {
        try
        {
            return 1;
        }finally
        {
            return 2;
        }
    }
    static int test()
    {
        int x=1;
        try 
        {
            return  x;
        }finally
        {
          ++x;
        }
    }
    static int test2()
    {
        int x=1;
        try
        {
            return  func1();
        }finally
        {
            return  func2();
        }
    }
    static int func1()
    {
        System.out.println("func1");
        return 1;
    }
    static int func2()
    {
        System.out.println("func2");
        return 2;
    }
}

