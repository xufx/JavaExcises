package typeinfo;
import java.util.*;
import typeinfo.factory.*;
/**工厂方法设计模式,定义了接口Factory，在静态类Factory中实现
 * Created by Administrator on 2017/6/19.
 */
class Part
{
    @Override
    public String toString()
    {
        return getClass().getSimpleName();//获得类名
    }
    /*partFactories工厂存储的对象，要继承Part类，实现了Factory接口*/
    static List<Factory<? extends  Part>>partFactories=
            new ArrayList<Factory<? extends Part>>();
    static
    {
        partFactories.add(new FuelFilter.Factory());//输出typeinfo.FuelFilter$Factory@4554617c
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }
    private static Random rand=new Random(47);
    public static Part createRandom()
    {
        int n=rand.nextInt(partFactories.size());
       // System.out.println("partFactories.get(n)="+partFactories.get(n));
        return partFactories.get(n).create();//随机返回类名
    }

}
/*Filter和Belt只是分类标识，不需要实例化*/
class Filter extends Part{}
class FuelFilter extends Filter
{//创建类工厂
    public static class Factory implements
            typeinfo.factory.Factory<FuelFilter>
    {
        public FuelFilter create()
        {
            return new FuelFilter();
        }
    }
}
class AirFilter extends Filter
{//创建类工厂
    public static class Factory implements
            typeinfo.factory.Factory<AirFilter>
    {
        public AirFilter create()
        {
            return new AirFilter();
        }
    }
}
class CabinAirFilter extends Filter
{//创建类工厂
    public static class Factory implements
            typeinfo.factory.Factory<CabinAirFilter>
    {
        public CabinAirFilter create()
        {
            return new CabinAirFilter();
        }
    }
}
class OilFilter extends Filter
{//创建类工厂
    public static class Factory implements
            typeinfo.factory.Factory<OilFilter>
    {
        public OilFilter create()
        {
            return new OilFilter();
        }
    }
}
class Belt extends Part{}
class FanBelt extends Belt
{//创建类工厂
    public static class Factory implements
            typeinfo.factory.Factory<FanBelt>
    {
        public FanBelt create()
        {
            return new FanBelt();
        }
    }
}
class GeneratorBelt extends Belt
{//创建类工厂
    public static class Factory implements
            typeinfo.factory.Factory<GeneratorBelt>
    {
        public GeneratorBelt create()
        {
            return new GeneratorBelt();
        }
    }
}
class PowerSteeringBelt extends Belt
{//创建类工厂
    public static class Factory implements
            typeinfo.factory.Factory<PowerSteeringBelt>
    {
        public PowerSteeringBelt create()
        {
            return new PowerSteeringBelt();
        }
    }
}
public class RegisteredFactories<T>
{
    public static void main(String[] args)
    {
        System.out.println(Part.partFactories);
        System.out.println(Part.partFactories.size());
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Part.createRandom());
        }
    }


}
