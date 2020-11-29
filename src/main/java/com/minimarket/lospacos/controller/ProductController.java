package com.minimarket.lospacos.controller;

import com.minimarket.lospacos.models.entity.Product;
import com.minimarket.lospacos.service.iface.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<Product> getAll(){
        return this.productService.getAll();
    }
    
<<<<<<< Updated upstream
    @PostMapping
=======
    @PostMapping("/create")
>>>>>>> Stashed changes
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Product product){
        this.productService.create(product);
    }
    
<<<<<<< Updated upstream
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
=======
    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
>>>>>>> Stashed changes
    public void update(@PathVariable int id, @RequestBody Product product){
        this.productService.update(id, product);
    }
    
<<<<<<< Updated upstream
    @DeleteMapping("/{id}")
=======
    @DeleteMapping("/delete/{id}")
>>>>>>> Stashed changes
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        this.productService.delete(id);
    }
}
