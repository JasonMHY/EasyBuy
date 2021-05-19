package com.service.impl;

import com.dao.ProductCategoryMapper;
import com.entity.ProductCategory;
import com.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategorySereviceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> itemTitle() {
        return productCategoryMapper.itemTitle();
    }

    @Override
    public List<ProductCategory> subtitle(int parentId) {
        return productCategoryMapper.subtitle(parentId);
    }
}
