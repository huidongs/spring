package pers.huidong.spring_ioc.demo8;

import javax.annotation.Resource;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 15:25
 * @description:
 */
public class ProductService {
    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;
    @Resource(name = "productDao")
    private ProductDao productDao;
    public void save(){
        System.out.println("ProductService的save方法");
        productDao.save();
        categoryDao.save();
    }
}
