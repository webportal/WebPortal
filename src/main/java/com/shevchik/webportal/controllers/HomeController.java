package com.shevchik.webportal.controllers;

import com.shevchik.webportal.domain.Category;
import com.shevchik.webportal.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        categoryService.addCategory(new Category());
        return "home/index";
    }
}
