/*
package spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
*/
/**
 * Created by xufuxiu on 2017/9/21.
 *//*

@Repository
public class EmpDaoImpl implements EmpDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public boolean save(Emp emp)
    {
        String sql="insert into emp values(?,?,?)";
        return jdbcTemplate.update(sql,emp.getId(),emp.getName(),emp.getBirthday())==1;
    }
}
*/
