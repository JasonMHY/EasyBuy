package com.service;

import com.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategory> itemTitle();
    List<ProductCategory> subtitle(int parentId);
}
