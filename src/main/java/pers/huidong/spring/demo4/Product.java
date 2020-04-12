package pers.huidong.spring.demo4;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 22:21
 * @description: Spel的属性注入测试类
 */
public class Product {
    private String name;
    private Double price;
    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
