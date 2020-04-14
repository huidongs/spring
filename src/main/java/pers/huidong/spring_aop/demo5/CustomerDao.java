package pers.huidong.spring_aop.demo5;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/14 13:54
 * @description: 带切入点的切面
 */
public class CustomerDao {

    public void save() {
        System.out.println("保存方法...");
    }

    public void update() {
        System.out.println("更新方法...");
    }

    public void delete() {
        System.out.println("删除方法...");
    }

    public void findAll() {
        System.out.println("查询方法...");
    }
}
