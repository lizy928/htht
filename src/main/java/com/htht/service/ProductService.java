package com.htht.service;

import com.htht.entity.News;
import com.htht.entity.Product;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
public interface ProductService {

    List<Product> getAll();

    Product getProductById(int Id);

    void updateProduct(Product product);

    void deleteProduct(int Id);

    void addProduct(Product product);
}
