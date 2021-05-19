package com.controller;

import com.dao.ProductCategoryMapper;
import com.dao.ProductMapper;
import com.entity.Product;
import com.entity.ProductCategory;
import com.service.ProductCategoryService;
import com.service.ProductService;
import com.uitl.RespBean;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@CrossOrigin
@RestController
public class productCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/itemTitle")
    public RespBean itemTitle() {
        List<ProductCategory> itemTitle = productCategoryService.itemTitle();
        if (itemTitle!=null){
            return RespBean.success("查询成功",itemTitle);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
    @RequestMapping(value = "/shop")
    public RespBean shop(){
        HashMap map = new HashMap();
        List<ProductCategory> itemTitle = productCategoryService.itemTitle();
        List itemType =new ArrayList();
        List Blurb =new ArrayList();
        for (int i = 0; i <itemTitle.size() ; i++) {
            itemType.add(productService.itemType(itemTitle.get(i).getId()));
        }
        for (int i = 0; i <itemTitle.size() ; i++) {
            Blurb.add(productService.Blurb(itemTitle.get(i).getId()));
        }
        map.put("itemTitle",itemTitle);
        map.put("itemType",itemType);
        map.put("Blurb",Blurb);
        if (map!=null){
            return RespBean.success("查询成功",map);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
    @RequestMapping(value = "/shopCategory")
    public RespBean subtitle(){
        HashMap map = new HashMap();
        List<ProductCategory> itemTitle = productCategoryService.itemTitle();
        List<ProductCategory> subtitle[] =new List[itemTitle.size()];
        List text =new ArrayList();
        for (int i = 0; i <itemTitle.size() ; i++) {
            subtitle[i]= (List<ProductCategory>) productCategoryService.subtitle(itemTitle.get(i).getId());
        }
        for (int i = 0; i <subtitle.length ; i++) {
            List text1 =new ArrayList();
            for (int k = 0; k <subtitle[i].size() ; k++) {
                text1.add(productCategoryService.subtitle(subtitle[i].get(k).getId()));
            }
            text.add(text1);
        }

        map.put("itemTitle",itemTitle);
        map.put("subtitle",subtitle);
        map.put("text",text);
        if (map!=null){
            return RespBean.success("查询成功",map);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
}
