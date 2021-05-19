package com.dao;


import com.entity.News;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface NewsMapper extends Mapper<News>{
    List<News> findAll();//公告
}
