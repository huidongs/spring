package pers.huidong.spring.demo2;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/11 1:28
 * @description: Bean2的静态工厂
 */
public class Bean2Factory {
    public static Bean2 createBean2(){
        System.out.println("createBean2f方法已执行！");
        return new Bean2();
    }
}
