package com.htht.dao;

import com.htht.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@Mapper
public interface ProductDao {

    List<Product> getAll();

    void updateProduct(@Param("product") Product product);

    Product getProductById(@Param("Id") int Id);

    void deleteProductById(@Param("Id") int Id);
}
