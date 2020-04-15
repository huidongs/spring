package pers.huidong.spring_aspectJ.demo1;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/15 10:15
 * @description: aspectJ方式的前置通知演示
 */
public class ProductDao {
    public void save() {
        System.out.println("保存商品....");
    }

    public String update() {
        System.out.println("更改商品....");
        return "Hello";
    }
    public void findOne() {
        System.out.println("查询一个商品....");
        //int i = 1/0;
    }
    public void findAll() {
        System.out.println("查询所有商品....");
    }

    public void delete() {
        System.out.println("删除商品....");
    }
}
