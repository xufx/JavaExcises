package io;
import java.io.Serializable;
/**java原生序列化技术
 * Created by xufuxiu on 2017/7/4.
 */
public class Tester implements Serializable
{
    /*s​e​r​i​a​l​V​e​r​s​i​o​n​U​I​D表示序​列​化​的​版​本​号​，凡是实现Serializable接口的类都有一个表示序列化版本标识符的静态变量。
    serialVersionUID的取值是Java运行时环境根据类的内部细节自动生成的。
    如果对类的源代码作了修改，再重新编译，新生成的类文件的serialVersionUID的取值有可能也会发生变化*/
    private static final long serialVersionUID=-730422746011869282L;
    private String test;
    public String getTest()
    {
        return test;
    }
    public void setTest(String test)
    {
        this.test = test;
    }
}
