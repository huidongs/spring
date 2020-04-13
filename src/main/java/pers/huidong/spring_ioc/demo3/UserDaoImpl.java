package pers.huidong.spring_ioc.demo3;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 13:56
 * @description: UserDao 的实现类
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("查询用户");
    }

    @Override
    public void save() {
        System.out.println("保存用户");
    }

    @Override
    public void update() {
        System.out.println("更改用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }
}
