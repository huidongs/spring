package pers.huidong.spring_aspectJ.demo2;

import org.aspectj.lang.JoinPoint;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/15 19:47
 * @description: 切面
 */
public class MyAspectXml {

    public void before(JoinPoint joinPoint){
        System.out.println("前置通知================="+joinPoint);
    }

    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("后置通知================="+joinPoint+"====="+result);
    }
}
