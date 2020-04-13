package pers.huidong.spring_aop.demo2;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 23:35
 * @description: cglib方式代理
 */
public class ProductDao {
    public void save() {
        System.out.println("保存用户....");
    }

    public void update() {
        System.out.println("更改用户....");
    }

    public void findAll() {
        System.out.println("查询用户....");
    }

    public void delete() {
        System.out.println("删除用户....");
    }
}
