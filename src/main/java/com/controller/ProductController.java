package com.controller;

import com.dao.ProductMapper;
import com.entity.Product;
import com.service.ProductService;
import com.uitl.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value ="/findName")
    public RespBean findName(@RequestParam(value = "name")  String name){
        List<Product> list = productService.findName(name);
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败",null);
        }
    }

    @RequestMapping(value ="/Blurb")
    public RespBean Blurb(@RequestParam(value = "categoryLevel1Id")  int categoryLevel1Id){
        List<Product> list = productService.Blurb(categoryLevel1Id);
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
    @RequestMapping(value ="/threeFindShop")
    public RespBean threeFindShop(@RequestParam(value = "categoryLevel3Id")  int categoryLevel3Id){
        List<Product> list = productService.threeFindShop(categoryLevel3Id);
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
    @RequestMapping(value ="/twoFindShop")
    public RespBean twoFindShop(@RequestParam(value = "categoryLevel2Id")  int categoryLevel2Id){
        List<Product> list = productService.twoFindShop(categoryLevel2Id);
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
    //商品详情
    @RequestMapping(value ="/Details")
    public RespBean Details(@RequestParam(value = "id")  int id){
        List<Product> list = productService.Details(id);
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
    //商品详情
    @RequestMapping(value ="/shopping")
    public List shopping(@RequestParam(value = "id")  int id){
        List<Product> list = productService.Details(id);

        if (list!=null){
            return list;
        }else{
            return null;
        }
    }
    /*@RequestMapping(value ="/itemType")
    public RespBean itemType(@RequestParam(value = "categoryLevel1Id")  int categoryLevel1Id){
        List<Product> list = productService.itemType(categoryLevel1Id);
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败",null);
        }
    }*/

}
