package com.htht.service.impl;

import com.htht.dao.ProductDao;
import com.htht.entity.Product;
import com.htht.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-30
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Value("${home-page.product-num}")
    private String homePageProductNumStr;

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Product getProductById(int Id) {
        return productDao.getProductById(Id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public void deleteProduct(int Id) {
        productDao.deleteProductById(Id);
    }

    @Override
    public void addProduct(Product product) {
        productDao.add(product);
    }

    @Override
    public Object getHeadProductList() {
        int homePageProductNum = Integer.parseInt(homePageProductNumStr);
        return productDao.getProductList(homePageProductNum);
    }
}
