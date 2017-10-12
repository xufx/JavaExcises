package overload;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/22.
 */
public class PrimitiveOverloading
{
    void f1(char x){sy("f1(char)");}
    void f1(byte x){sy("f1(byte)");}
    void f1(short x){sy("f1(short)");}
    void f1(int x){sy("f1(int)");}
    void f1(long x){sy("f1(long)");}
    void f1(float x){sy("f1(float)");}
    void f1(double x){sy("f1(double)");}

    void f2(byte x){sy("f2(byte)");}
    void f2(short x){sy("f2(short)");}
    void f2(int x){sy("f2(int)");}
    void f2(long x){sy("f2(long)");}
    void f2(float x){sy("f2(float)");}
    void f2(double x){sy("f2(double)");}

    void f3(short x){sy("f3(short)");}
    void f3(int x){sy("f3(int)");}
    void f3(long x){sy("f3(long)");}
    void f3(float x){sy("f3(float)");}
    void f3(double x){sy("f3(double)");}

    void f4(int x){sy("f4(int)");}
    void f4(long x){sy("f4(long)");}
    void f4(float x){sy("f4(float)");}
    void f4(double x){sy("f4(double)");}

    void f5(long x){sy("f5(long)");}
    void f5(float x){sy("f5(float)");}
    void f5(double x){sy("f5(double)");}

    void f6(float x){sy("f6(float)");}
    void f6(double x){sy("f6(double)");}

    void f7(double x){sy("f7(double)");}

    void  testConstVal()
    {
        sy("5:");
        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);

    }
    void testChar()
    {
        char x='x';
        sy("char:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testByte()
    {
       byte x=0;
        sy("byte:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testShort()
    {
        short x=0;
        sy("short:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testInt()
    {
        int x=0;
        sy("int:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testLong()
    {
        long x=0;
        sy("long:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testFloat()
    {
        float x=0;
        sy("float:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testDouble()
    {
        double x=0;
        sy("double:");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    public static void main(String[] args)
    {
        PrimitiveOverloading p=new PrimitiveOverloading();
        p.testChar();
    }
}
