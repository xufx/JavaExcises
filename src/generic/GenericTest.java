package generic;

/**
 * Created by Administrator on 2017/6/6.
 */
public class GenericTest
{
    public  static  void  main(String[] args)
    {
        /*
        Box<Number>name=new Box<Number>(99);
        Box<Integer>age=new Box<Integer>(712);
        getData(name);
        */
        /*
        Box <Integer> a=new Box<Integer>(712);
        Box<Number> b=a; //在逻辑上Box<Number>不能视为Box<Integer>的父类。
        Box<Float>f=new Box<Float>(3.14f);
        b.setData(f); //
        //需要一个在逻辑上可以用来表示同时是Box<Integer>和Box<Number>的父类的一个引用类型，
        // 由此，类型通配符应运而生
        */
        Box<String>name=new Box<String>("corn");
        Box<Integer>age=new Box<Integer>(712);
        Box<Number>number=new Box<Number>(314);
        getData(name);
        getData(age);
        getData(number);

        //getUpperNumberData(name);//类型通配符上限、下限
        getUpperNumberData(age);
        getUpperNumberData(number);
    }
    public static  void getData(Box<?> data)
    {//类型通配符一般是使用 ? 代替具体的类型实参
        System.out.println("data:"+data.getData());
    }
    public static void getUpperNumberData(Box<? extends Number>data)
    {
        System.out.println("data:"+data.getData());
    }
}
class Box<T>
{
    private T dada;
    public Box(){}
    public Box(T data)
    {
        this.dada=data;
    }

    public T getData()
    {
        return dada;
    }

    public void setDada(T dada) {
        this.dada = dada;
    }
}
