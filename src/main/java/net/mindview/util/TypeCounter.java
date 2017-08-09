package net.mindview.util;
import java.util.*;
/**递归计数
 * Created by Administrator on 2017/6/19.
 */
public class TypeCounter extends HashMap<Class<?>,Integer>
{
    private Class<?> baseType;
    public TypeCounter(Class<?> baseType)
    {
       this.baseType = baseType;
    }
    public void count(Object obj)
    {
        Class<?> type=obj.getClass();
        if(!baseType.isAssignableFrom(type))
        {
            throw new RuntimeException(
                    obj+"incorrect type:"+type+",should be type or subtype of"+baseType);
        }
        countClass(type);
    }
    private void countClass(Class<?>type)
    {
        Integer quantity=get(type);
        put(type,quantity==null?1:quantity+1);
        Class<?> superClass=type.getSuperclass();
        if (superClass!=null && baseType.isAssignableFrom(superClass))
        countClass(superClass);
    }
    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder("{");
        for(Map.Entry<Class<?>,Integer> pair:entrySet())
        {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(",");
        }
        result.delete(result.length()-2,result.length());
        result.append("}");
        return result.toString();
    }
}
