package pers.huidong.spring_ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther huidong
 * @date 2020/4/10 0:07
 */
public class SpringDemo1 {

    @Test
    public void demo1(){
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }
    @Test
    public void demo2(){
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类：
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }
}
