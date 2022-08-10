package com.eunhee.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/introduce", method = RequestMethod.GET)
    public ModelAndView introducePageWithUrl() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("githubUrl","https://github.com/eunheekimm");
        modelAndView.addObject("instagramUrl","https://www.instagram.com/carpe_d.iem/");
        modelAndView.addObject("naverBlogUrl","https://blog.naver.com/dmsgml_08/222701199180");
        
        return modelAndView;
    }

}