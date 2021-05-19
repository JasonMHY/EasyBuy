package com.service.impl;

import com.dao.NewsMapper;
import com.entity.News;
import com.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public List<News> findAll() {
        return newsMapper.findAll();
    }
}
