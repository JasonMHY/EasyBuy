package com.dao;

import com.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductCategoryMapper {
    List<ProductCategory> itemTitle();//一级标题
    List<ProductCategory> subtitle(int parentId);//二级标题

}
