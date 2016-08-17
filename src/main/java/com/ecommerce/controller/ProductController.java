package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alx on 8/17/2016.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/productList/{type}")
    public String getProducts(@PathVariable String type, Model model) {
        model.addAttribute("products", productService.listAllByType(type));
        return "productList";
    }


    @RequestMapping("/productList/all")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.listAll());
        return "productList";
    }


    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable int productId, Model model) {
        Product product = productService.findById(productId);
        model.addAttribute("product", product);
        return "viewProduct";
    }
}
