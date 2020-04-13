package pers.huidong.spring_ioc.demo6;

import org.springframework.stereotype.Repository;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 14:15
 * @description:
 */
@Repository("userDao")
public class UserDao {
    public void save(){
        System.out.println("Dao保存用户");
    }
}
