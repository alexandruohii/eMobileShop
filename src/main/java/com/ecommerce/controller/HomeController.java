package com.ecommerce.controller;

import com.ecommerce.model.Game;
import com.ecommerce.model.Product;
import com.ecommerce.service.GameService;
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

    /*@Autowired
    ProductDao productDao;*/
    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    /*@RequestMapping("/productListgame")
    public String getProducts(Model model) {
        List<Game> games = gameService.list();
        model.addAttribute("gameProducts", games);
        return "productListgame";
    }*/

    @RequestMapping("/productList")
    public String getProducts( Model model) {
        List< ? extends Product> products = productService.listGames();
        model.addAttribute("products", products);
        return "productList";
    }

    /*@RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable int productId, Model model) {
        Product product = productService.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }*/


}
