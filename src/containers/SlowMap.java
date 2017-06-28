package containers;
import java.util.*;
import net.mindview.util.*;
/**使用一对ArrayList实现了一个Map
 * Created by Administrator on 2017/6/28.
 */
public class SlowMap<K,V> extends AbstractMap<K,V>
{
    private List<K>keys=new ArrayList<K>();
    private List<V>values=new ArrayList<V>();
    /*添加键和值*/
    public V put(K key,V value)
    {//将键和值放入相应的ArrayList
        V oldValue=get(key);
        if (!keys.contains(key))
        {
            keys.add(key);
            values.add(value);
        }
        else
        {
            values.set(keys.indexOf(key),value);
        }
        return oldValue;
    }
    public V get(Object key)
    {//获得=键为key的值
        if (!keys.contains(key))return null;
        return values.get(keys.indexOf(key));
    }
    public Set<Map.Entry<K,V>>entrySet()
    {
        Set<Map.Entry<K,V>>set=new HashSet<Map.Entry<K,V>>();
        Iterator<K>ki=keys.iterator();
        Iterator<V>vi=values.iterator();
        while (ki.hasNext())
            set.add(new MapEntry<K,V>(ki.next(),vi.next()));
        return set;
    }
    public static void main(String[] args)
    {
        SlowMap<String,String>m=new SlowMap<String,String>();
        m.putAll(Countries.capitals(15));
        System.out.println(m);
        System.out.println(m.get("BULGARIA"));
        System.out.println(m.entrySet());
    }
}
