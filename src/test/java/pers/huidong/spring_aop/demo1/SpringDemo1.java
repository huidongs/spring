package pers.huidong.spring_aop.demo1;

import org.junit.Test;
import pers.huidong.spring_aop.demo1.MyJdkProxy;
import pers.huidong.spring_aop.demo1.UserDao;
import pers.huidong.spring_aop.demo1.UserDaoImpl;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 22:43
 * @description: JDK动态代理测试
 */
public class SpringDemo1 {
    @Test
    public void demo1(){
       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = new UserDaoImpl();
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.save();
        proxy.delete();
        proxy.update();
        proxy.findAll();
    }
}
