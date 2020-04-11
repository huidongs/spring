package pers.huidong.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.SchemaOutputResolver;
import java.sql.SQLOutput;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/11 0:47
 * @description: Spring实现Bean实例化的三种方式
 */
public class SpringDemo2 {

    @Test
    public void Bean1() {
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        //
    }
    @Test
    public void Bean2() {
        //创建工厂,创建工厂时配置文件中的类已经实例化了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例：从工厂中获取已经实例化的类对象实例
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        //System.out.println(bean2.name);

    }
    @Test
    public void Bean3() {
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
       // Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");

    }
}
