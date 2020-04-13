package pers.huidong.spring_ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/11 23:53
 * @description: Bean的作用范围测试
 */
public class SpringDemo3 {
    @Test
    public void Bean1() {
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Person person1 = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");
        //会发现两个实例的地址一样
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    public void Bean2() {
        //创建工厂
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Man man = (Man) applicationContext.getBean("man");
        man.run();
        applicationContext.close();

    }

    @Test
    public void Bean3() {
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.findAll();
        userDao.save();
        userDao.update();
        userDao.delete();
    }

}
