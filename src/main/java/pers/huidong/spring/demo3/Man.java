package pers.huidong.spring.demo3;

import com.sun.javaws.IconUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;

import javax.lang.model.element.NestingKind;
import java.sql.SQLOutput;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 0:15
 * @description: Bean的生命周期测试类
 */
public class Man implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    public void setName(String name) {
        System.out.println("第二步:设置属性..."+name);
        this.name = name;
    }
    public Man(){
        System.out.println("第一步：初始化...");
    }
    public void setUp(){
        System.out.println("第七步:Man被初始化了...");
    }
    public void tearDown(){
        System.out.println("第十一步:Man被销毁了...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第三步:设置Bean的名称"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("第四步:了解工厂的信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步:属性设置之后...");
    }
    public void run(){
        System.out.println("第九步:执行业务方法...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步:执行Spring的销毁方法...");
    }
}
