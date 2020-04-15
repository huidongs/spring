package pers.huidong.spring_aspectJ.demo2;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/15 19:42
 * @description: aspectJ的XML配置方式
 */
public class CustomerImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存操作.....");
    }

    @Override
    public String delete() {
        System.out.println("删除操作......");
        return "Hello";
    }

    @Override
    public void update() {
        System.out.println("修改操作.....");
    }

    @Override
    public void findAll() {
        System.out.println("查询所有操作.....");
    }

    @Override
    public void findOne() {
        System.out.println("查询一个操作.....");
    }
}
