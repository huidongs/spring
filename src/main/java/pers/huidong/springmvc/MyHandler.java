package pers.huidong.springmvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/17 10:45
 * @description:
 */
public class MyHandler implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","tom");
        modelAndView.setViewName("show");
        return modelAndView;
    }
}