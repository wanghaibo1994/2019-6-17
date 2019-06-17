package cn.itcast;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class DaoTest {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void test1(){
        List<Account> list = accountDao.findAll();
        System.out.println(list);
    }
}
