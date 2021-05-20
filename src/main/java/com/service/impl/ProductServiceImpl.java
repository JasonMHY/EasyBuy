package com.service.impl;

import com.dao.ProductMapper;
import com.entity.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> itemType(int categoryLevel1Id) {
        return productMapper.itemType(categoryLevel1Id);
    }

    @Override
    public List<Product> Blurb(int categoryLevel1Id) {
        return productMapper.Blurb(categoryLevel1Id);
    }

    @Override
    public List<Product> findName(String name) {
        return productMapper.findName(name);
    }

    @Override
    public List<Product> threeFindShop(int categoryLevel3Id) {
        return productMapper.threeFindShop(categoryLevel3Id);
    }

    @Override
    public List<Product> twoFindShop(int categoryLevel2Id) {
        return productMapper.twoFindShop(categoryLevel2Id);
    }

    @Override
    public List<Product> Details(int id) {
        return productMapper.Details(id);
    }

    @Override
    public int alterRepertoryById(int stock, int id) {
        return productMapper.alterRepertoryById(stock,id);
    }
}
