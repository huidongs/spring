package pers.huidong.spring_ioc.demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 11:25
 * @description: 注解方式测试
 */
public class SpringDemo6 {
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService  = (UserService) applicationContext.getBean("userService");
        System.out.println( userService.SayHello("huidong"));
    }
    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService  = (UserService) applicationContext.getBean("userService");
        userService.eat();
        //System.out.println( userService.eat());
    }
    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService  = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
