package pers.huidong.spring_ioc.demo4;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 22:32
 * @description: 计算商品价格
 */
public class ProductInfo {
    public Double calculatePrice(){
        return Math.random()*100;
    }
}
