package annotations.database;
/**
 * Created by xufuxiu on 2017/7/3.
 */
import java.lang.annotation.*;

@Target(ElementType.TYPE) // Applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}