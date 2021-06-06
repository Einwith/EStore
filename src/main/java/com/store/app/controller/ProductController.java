package com.store.app.controller;

import com.store.app.model.Product;
import com.store.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        System.out.println(productService.getAllProducts());
        return productService.getAllProducts();

    }

    @RequestMapping("/products/{id}")
    public Product getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/products/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product product) {
        productService.updateProduct(id, product);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }


}
