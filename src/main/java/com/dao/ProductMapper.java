package com.dao;

import com.entity.Product;
import com.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> itemType(int categoryLevel1Id);//显示一级分类下二级分类 二级分类下三级分类
    List<Product> Blurb(int categoryLevel1Id);//显示一级分类下商品
    List<Product> findName(String name);//搜索
    List<Product> threeFindShop(int categoryLevel3Id);//三级导航点击
    List<Product> twoFindShop(int categoryLevel2Id);//二级导航点击
    List<Product> Details(int id);//商品详情
 }
