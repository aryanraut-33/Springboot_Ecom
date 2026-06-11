package com.aryan.Ecom.controller;

import com.aryan.Ecom.model.Product;
import com.aryan.Ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){ // @RequestBody annotation is important here as without this the api wil not be able to load the details sent through the post request
        System.out.println(prod);
        service.addProduct(prod);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductbyId(@PathVariable int id){
        return new ResponseEntity<>(service.getProductbyId(id), HttpStatus.OK);
    }
}
