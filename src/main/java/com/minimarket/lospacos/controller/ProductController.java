package com.minimarket.lospacos.controller;

import com.minimarket.lospacos.models.entity.Product;
import com.minimarket.lospacos.service.iface.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
    
    @PostMapping
    public void create(@RequestBody Product product){
        productService.create(product);
    }
    
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Product product){
        productService.update(id, product);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }
}
