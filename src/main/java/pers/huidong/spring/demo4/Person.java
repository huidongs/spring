package pers.huidong.spring.demo4;

import java.security.PrivateKey;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 19:46
 * @description: set方法的属性注入
 */
public class Person {
    private String name;
    private Integer age;
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }
}
