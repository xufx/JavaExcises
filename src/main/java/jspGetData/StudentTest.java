package jspGetData;
import java.util.*;
/**
 * Created by xufuxiu on 2017/8/9.
 */
public class StudentTest
{
     public static void main(String[] args)
      {
         /* List<Map<String,Object>> students = new ArrayList<Map<String,Object>>();
          Map<String,Object> s1 = new HashMap<String,Object>();
          s1.put("name","jim");
          s1.put("age","15");
          students.add(s1);
          Map<String,Object> s2 = new HashMap<String,Object>();
          s2.put("name","lucy");
          s2.put("age","12");
          students.add(s2);*/

          /*Set<Student> set=new TreeSet<>();
          set.add(new Student("HaoLUO",33));
          set.add(new Student("WANG XIAO",23));
          set.add(new Student("liutao",40));
          set.add(new Student("manman",10));
          for (Student stu:set)
          {
              System.out.println(stu);
          }*/

          List<Student> list=new ArrayList<>();
          list.add(new Student("HaoLUO",33));
          list.add(new Student("WANG XIAO",23));
          list.add(new Student("liutao",40));
          list.add(new Student("manman",10));
          for (Student stu:list)
          {
              System.out.println(stu);
          }
          Collections.sort(list,new Comparator<Student>()
          {/*将list根据姓名进行升序排序*/
              @Override
              public int compare(Student o1, Student o2)
              {
                  return o1.getName().compareTo(o2.getName());//比较学生姓名，升序
              }
          });
          System.out.println("Compare之后");
          for (Student stu:list)
          {
              System.out.println(stu);
          }
      }

}
