package com.aryan.Ecom.controller;

import com.aryan.Ecom.model.Product;
import com.aryan.Ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

//    @Autowired
    private final ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping("/")
    public String greet(){
        return "Hello User!";
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){ //not @RequestBody annotation is important here as without this the api wil not be able to load the details sent through the post request
        System.out.println(prod);
        service.addProduct(prod);
    }
}
