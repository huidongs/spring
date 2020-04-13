package pers.huidong.spring_aop.demo2;

import org.junit.Test;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 23:45
 * @description: Cglib方式代理
 */
public class SpringDemo2 {
    @Test
    public void demo1(){
        ProductDao productDao = new ProductDao();
        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();

        proxy.save();
        proxy.delete();
        proxy.findAll();
        proxy.update();
    }
}
