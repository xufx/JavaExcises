package containers;
import net.mindview.util.Countries;

import java.util.*;
/**
 * Created by Administrator on 2017/6/28.
 */
public class SimpleHashMap<K,V> extends AbstractMap<K,V>
{
    static final int SIZE=997;
    /*槽位（slot）*/
    LinkedList<MapEntry<K,V>>[] buckets=new LinkedList[SIZE];
    public V put(K key,V value)
    {//将键和值放入相应的ArrayList
        V oldValue=null;
        int index=Math.abs(key.hashCode())%SIZE;
        if (buckets[index]==null)
            buckets[index]=new LinkedList<MapEntry<K,V>>();
       LinkedList<MapEntry<K,V>>bucket=buckets[index];
        MapEntry<K,V> pair=new MapEntry<K,V>(key,value);
        boolean found=false;
        ListIterator<MapEntry<K,V>> it=bucket.listIterator();
        while (it.hasNext())
        {
            MapEntry<K,V> ipair=it.next();
            if (!ipair.getKey().equals(key))
            {
                oldValue=ipair.getValue();
                it.set(pair);
                found=true;
                break;
            }
        }
        if (!found)buckets[index].add(pair);
        return oldValue;
    }
    public V get(Object key)
    {//获得=键为key的值\
        int index=Math.abs(key.hashCode())%SIZE;
        if (buckets[index]==null)return null;
        for (MapEntry<K,V> ipair:buckets[index])
        {
            if (ipair.getKey().equals(key))return ipair.getValue();
        }
        return null;
    }
    public Set<Map.Entry<K,V>> entrySet()
    {
        Set<Map.Entry<K,V>>set=new HashSet<Map.Entry<K,V>>();
        for (LinkedList<MapEntry<K,V>>bucket:buckets)
        {
            if (bucket==null)continue;
            for (MapEntry<K,V>mpair:bucket)set.add(mpair);
        }
        return set;
    }
    public static void main(String[] args)
    {
        SimpleHashMap<String,String> m=new SimpleHashMap<>();
        m.putAll(Countries.capitals());
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());
    }
}
