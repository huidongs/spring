package pers.huidong.spring_aspectJ.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/15 19:55
 * @description: aspectJ的XML方式配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo2 {

    @Resource(name = "customerDao")
    private CustomerDao customerDao;
    @Test
    public void demo1(){
        customerDao.save();
        customerDao.delete();
        customerDao.findAll();
        customerDao.update();
        customerDao.findOne();
    }
}
