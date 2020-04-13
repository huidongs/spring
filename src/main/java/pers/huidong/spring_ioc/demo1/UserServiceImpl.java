package pers.huidong.spring_ioc.demo1;

/**
 * @auther huidong
 * @date 2020/4/10 0:03
 */
public class UserServiceImpl implements UserService{
    public String name;

    @Override
    public void sayHello() {
        System.out.println("Hello!  "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
