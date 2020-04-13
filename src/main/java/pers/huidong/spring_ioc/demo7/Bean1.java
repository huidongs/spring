package pers.huidong.spring_ioc.demo7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 14:38
 * @description:
 */
@Component("bean1")
public class Bean1 {
    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    public void say(){
        System.out.println("say");
    }
    @PreDestroy
    public void destory(){
        System.out.println("destory");
    }
}
