package pers.huidong.spring.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.huidong.spring.demo4.User;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 10:49
 * @description: 复杂类型属性注入
 */
public class SpringDemo5 {
    /**
     * @Description: 复杂类型的属性注入测试
     */
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean  = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
    }
}
