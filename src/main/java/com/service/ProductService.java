package com.service;

import com.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> itemType(int categoryLevel1Id);
    List<Product> Blurb(int categoryLevel1Id);
    List<Product> findName(String name);
    List<Product> threeFindShop(int categoryLevel3Id);
    List<Product> twoFindShop(int categoryLevel2Id);
    List<Product> Details(int id);
    int alterRepertoryById(int stock,int id);
}
