package com.eunhee.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    UrlService urlService;


    @RequestMapping(value = "/introduce", method = RequestMethod.GET)
    public ModelAndView introducePageWithUrl() {
        ModelAndView modelAndView = new ModelAndView("index");
        Map<String, String> urlMap = urlService.getPageUrls();

        modelAndView.addObject("githubUrl", urlMap.get("github"));
        modelAndView.addObject("instagramUrl",urlMap.get("instagram"));
        modelAndView.addObject("naverBlogUrl",urlMap.get("naverBlog"));
        
        return modelAndView;
    }

}