package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

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
    public String getProducts(@PathVariable String type,  Model model) {
        model.addAttribute("products", productService.listAllByType(type));
        return "productList";
    }


    @RequestMapping("/productList/all")
    public String getProducts( Model model) {
        model.addAttribute("products", productService.listAll());
        return "productList";
    }




    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable int productId, Model model) {
        Product product = productService.findById(productId);
        model.addAttribute("product", product);
        return "viewProduct";
    }

    @RequestMapping("/login")
    public String doLogin(){

        return "login";
    }

}
