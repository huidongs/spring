package pers.huidong.spring_aspectJ.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/15 10:39
 * @description: aspectJ测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class SpringDemo1 {
    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void demo1(){
        productDao.delete();
        productDao.findAll();
        productDao.findOne();
        productDao.save();
        productDao.update();
    }
}
