package com.freemaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @program: freemaker
 * @description: ${description}
 * @author: Elk love madness
 * @create: 2018-08-30 17:06
 */
@Controller
public class PageTestController {
  @RequestMapping("/hello")
  public String hello(String name, Model model){
    System.out.println(name);
    model.addAttribute("name", name);
    return "app";
  }

}
