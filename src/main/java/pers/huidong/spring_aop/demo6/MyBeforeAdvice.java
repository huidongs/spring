package pers.huidong.spring_aop.demo6;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/14 10:08
 * @description: 增强类
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("权限校验===============");
    }
}
