package pers.huidong.spring_ioc.demo6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 11:20
 * @description: 注解方式
 */
@Component("userService")
public class UserService {
    @Value("米饭")
    private String something;
//    @Autowired
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    public String SayHello(String name) {
        return "Hello !" + name;
    }

    public void eat() {
        System.out.println("eat:" + something);
    }

    public void save() {
        System.out.println("service中的保存操作");
        userDao.save();
    }
}
