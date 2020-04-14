package pers.huidong.spring_aop.demo6;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/14 9:51
 * @description: Advisor切面：普通切面
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public void save() {
        System.out.println("保存方法...");
    }

    @Override
    public void update() {
        System.out.println("更新方法...");
    }

    @Override
    public void delete() {
        System.out.println("删除方法...");
    }

    @Override
    public void findAll() {
        System.out.println("查询方法...");
    }
}
