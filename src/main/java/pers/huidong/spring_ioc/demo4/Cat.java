package pers.huidong.spring_ioc.demo4;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 19:46
 * @description: set方法的熟悉注入：测试对象属性
 */
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
