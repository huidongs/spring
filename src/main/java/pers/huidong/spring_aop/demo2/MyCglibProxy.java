package pers.huidong.spring_aop.demo2;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import pers.huidong.spring_ioc.demo4.Product;

import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 23:36
 * @description:
 */
public class MyCglibProxy implements MethodInterceptor {
    private ProductDao productDao;
    public MyCglibProxy(ProductDao productDao){
        this.productDao=productDao;
    }

    public Object createProxy(){
        //1创建核心类
        Enhancer enhancer = new Enhancer();
        //2设置父类
        enhancer.setSuperclass(productDao.getClass());
        //3设置回调
        enhancer.setCallback(this);
        //4生成代理
        Object proxy = enhancer.create();
        return proxy;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if ("save".equals(method.getName())){
            System.out.println("权限校验...");
            return methodProxy.invokeSuper(proxy,args);
        }
        return methodProxy.invokeSuper(proxy,args);
    }
}
