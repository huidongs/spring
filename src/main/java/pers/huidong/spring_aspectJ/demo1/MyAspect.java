package pers.huidong.spring_aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import sun.awt.SunHints;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/15 10:20
 * @description: 注解方式的切面
 */
@Aspect()
public class MyAspect {
    @Before(value = "pointCut2()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知================" + joinPoint);
    }

    @AfterReturning(value = "pointCut5()", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("后置通知================" + result);
    }

    @Around(value = "pointCut3()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前通知=============");
        Object obj = proceedingJoinPoint.proceed();//执行目标方法:如果不调用该方法，那么目标方法将会被拦截
        System.out.println("环绕后通知=============");
        return obj;
    }

    @AfterThrowing(value = "pointCut4()", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("================异常抛出通知===============" + e.getMessage());
    }

    @After(value = "pointCut1()")
    public void after() {
        System.out.println("最终通知");
    }




    @Pointcut(value = "execution(* pers.huidong.spring_aspectJ.demo1.ProductDao.findAll(..)))")
    private void pointCut1(){}
    @Pointcut(value = "execution(* pers.huidong.spring_aspectJ.demo1.ProductDao.save(..)))")
    private void pointCut2(){}
    @Pointcut(value = "execution(* pers.huidong.spring_aspectJ.demo1.ProductDao.delete(..)))")
    private void pointCut3(){}
    @Pointcut(value = "execution(* pers.huidong.spring_aspectJ.demo1.ProductDao.findOne(..)))")
    private void pointCut4(){}
    @Pointcut(value = "execution(* pers.huidong.spring_aspectJ.demo1.ProductDao.update(..)))")
    private void pointCut5(){}
}
