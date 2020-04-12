package pers.huidong.spring.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 1:18
 * @description: Bean后处理类
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步:初始化前方法...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("第八步:初始化后的方法...");
        if ("userDao".equals(beanName)) {
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("update".equals(method.getName())) {
                        System.out.println("检验权限=======");
                        method.invoke(bean, args);
                    }
                    return method.invoke(bean, args);
                }
            });
            return proxy;
        } else {
            return bean;
        }


    }
}
