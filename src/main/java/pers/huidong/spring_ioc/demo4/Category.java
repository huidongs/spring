package pers.huidong.spring_ioc.demo4;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 22:22
 * @description: Spel的属性注入
 */
public class Category {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
