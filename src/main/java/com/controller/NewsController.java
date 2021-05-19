package com.controller;

import com.entity.News;
import com.entity.User;
import com.service.NewsService;
import com.uitl.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;
    @RequestMapping(value = "/NewsFindAll")
    public RespBean NewsFindAll(){
        List<News> list = newsService.findAll();
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
}
