package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version : V1.0
 * @ClassName: IndexController
 * @Description: TODO
 * @Auther: chengyang
 * @Date: 2020/4/22 16:18
 */
@Controller
public class IndexController {


    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }
}
