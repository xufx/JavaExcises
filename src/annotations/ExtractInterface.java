package annotations;
import java.lang.annotation.*;
/**
 * Created by xufuxiu on 2017/7/3.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface
{
    public String value();
}
