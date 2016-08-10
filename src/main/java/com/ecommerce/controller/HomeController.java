package com.ecommerce.controller;

import com.ecommerce.dao.ProductDaoo;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

/**
 * Created by Alx on 8/9/2016.
 */
@Controller
@SessionScope
public class HomeController {


    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/productList/{type}")
    public String getProducts(@PathVariable String type, Model model) {
        List<String> listTypes = productService.getlistTypes();
        List<Product> products = productService.listProduct(type);
        model.addAttribute("products", products);
        model.addAttribute("type", type);
        model.addAttribute("listTypes", listTypes);
        return "productList";
    }



    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable int productId, Model model) {
        Product product = productService.findById(productId);
        model.addAttribute("product", product);
        return "viewProduct";
    }

@RequestMapping("/admin")
    public String adminPage(){
    return "admin";
}

}
