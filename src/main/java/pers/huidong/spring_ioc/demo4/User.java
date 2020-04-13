package pers.huidong.spring_ioc.demo4;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 18:52
 * @description: Spring属性注入
 */
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
