package com.aryan.Ecom.service;

import com.aryan.Ecom.model.Product;
import com.aryan.Ecom.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public Product getProductbyId(int prodId) {
        return repo.getProductByProdId(prodId);
    }
}
