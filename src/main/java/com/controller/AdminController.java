package com.controller;

import com.entity.News;
import com.uitl.RespBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class AdminController {
    @RequestMapping(value = "/admin")
    public ModelAndView admin(){
        return new ModelAndView("index");
    }
}
