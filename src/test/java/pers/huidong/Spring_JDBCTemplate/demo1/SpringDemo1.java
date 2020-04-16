package pers.huidong.Spring_JDBCTemplate.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/16 9:17
 * @description: JDBCTemplate测试
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@Resource(name = "classpath:applicationContext.xml")
public class SpringDemo1 {

    //private JdbcTemplate jdbcTemplate;
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("create table user1(id int,name varchar (20))");
    }

    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        String sql = "insert into student(name,sex)value(?,?)";
        jdbcTemplate.update(sql,new Object[]{"张飞","男"});

    }
}
