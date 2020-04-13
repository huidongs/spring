package pers.huidong.spring_ioc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 19:01
 * @description: Spring属性注入测试
 */
public class SpringDemo4 {

    /**
    * @Description: Bean的构造方法的属性注入
    */
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
    /**
    * @Description: set方法的属性注入
    */
    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
    /**
     * @Description: p名称空间的属性注入
     */
    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
    /**
     * @Description: SpEL的属性注入
     */
    @Test
    public void demo4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) applicationContext.getBean("product");
        System.out.println(product);
    }
}
