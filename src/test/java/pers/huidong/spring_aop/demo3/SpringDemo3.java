package pers.huidong.spring_aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/14 9:55
 * @description: Advisor切面测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {
    @Resource(name = "studentDaoProxy")
   // @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Test
    public void demo1(){
        studentDao.save();
        studentDao.delete();
        studentDao.findAll();
        studentDao.update();
    }
}
