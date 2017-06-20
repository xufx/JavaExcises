package typeinfo.factory;

import java.util.*;
/**
 * Created by Administrator on 2017/6/19.
 */
public interface Factory<T>
{
    T create();//返回值类型为T
}
