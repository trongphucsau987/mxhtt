/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ph.service;

import com.ph.pojo.Comment;
import com.ph.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public interface ProductService {
    List<Product> getProducts(Map<String, String> params, int page);
    int countProduct();
    boolean addProduct(Product p);
    boolean deleteProduct(int id);
    List<Object[]> countProdsByCate();
    List<Object[]> revenueStats(int quarter, int year);
    List<Comment> getComments(int productId);
    Product getProductById(int productId);
    Comment addComment(String content, int productId);
}