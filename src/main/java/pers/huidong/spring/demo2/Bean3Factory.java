package pers.huidong.spring.demo2;

import com.sun.javaws.IconUtil;

import java.sql.SQLOutput;
import java.util.zip.CheckedOutputStream;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/11 18:08
 * @description: Bean3实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("createBean3方法已执行");
        return new Bean3();
    }
}
