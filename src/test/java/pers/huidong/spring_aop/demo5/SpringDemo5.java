package pers.huidong.spring_aop.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/14 22:15
 * @description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo5 {
    @Resource(name = "customerDao")
    private CustomerDao customerDao;
    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Test
    public void demo1(){
        customerDao.delete();
        customerDao.findAll();
        customerDao.save();
        customerDao.update();

        studentDao.delete();
        studentDao.findAll();
        studentDao.save();
        studentDao.update();
    }
}
