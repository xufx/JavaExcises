/*
package spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
*/
/**
 * Created by xufuxiu on 2017/9/21.
 *//*

@Service
public class EmpServiceImpl implements EmpService
{
    @Autowired
    private TransactionTemplate txTemplate;
    @Autowired
    private EmpDao empDao;
    public void addEmp(final Emp emp)
    {
        txTemplate.execute(new TransactionCallbackWithoutResult()
        {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus txStatus)
            {
                empDao.save(emp);
            }
        });
    }
}
*/
