package com.htht.controller;

import com.htht.entity.News;
import com.htht.entity.Product;
import com.htht.service.NewsService;
import com.htht.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@RequestMapping("product")
@RestController
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @RequestMapping("getHeadProductList")
    public Object getHeadProductList() {
        return buildSuccJson(productService.getHeadProductList());
    }

    @RequestMapping("getAll")
    public Object getAll() {
        return buildSuccJson(productService.getAll());
    }

    @RequestMapping("getProductById")
    public Object getNewsById(int Id) {
        return buildSuccJson(productService.getProductById(Id));
    }

    @RequestMapping(value = "addProduct", method = RequestMethod.POST)
    public Object addNews(@RequestBody Product product) {
        productService.addProduct(product);
        return buildSuccJson();
    }

    @RequestMapping("deleteProductById")
    public Object deleteNewsById(int Id) {
        productService.deleteProduct(Id);
        return buildSuccJson();
    }

    @RequestMapping("updateProduct")
    public Object updateNews(Product product) {
        productService.updateProduct(product);
        return buildSuccJson();
    }

}
