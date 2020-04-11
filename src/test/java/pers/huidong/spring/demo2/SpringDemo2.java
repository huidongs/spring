package pers.huidong.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

}
