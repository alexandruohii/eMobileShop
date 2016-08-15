package com.ecommerce.controller.admin;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Alx on 8/14/2016.
 */

@Controller
@RequestMapping("/admin")
public class Admin {


    @Autowired
    private ProductService productService;

   @RequestMapping("/")
    public String adminHome(){
        return "admin";
    }

    @RequestMapping("/productInventory/{type}")
    public String getProducts(@PathVariable String type, Model model) {
        model.addAttribute("products", productService.listAllByType(type));
        return "productInventory";
    }


    @RequestMapping("/productInventory/all")
    public String getProducts( Model model) {
        model.addAttribute("products", productService.listAll());
        return "productInventory";
    }



    @RequestMapping("/addProduct")
    public String addProduct(Model model){
        Product product = new Product();
        model.addAttribute("product", product);

    return "addProduct";
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public String addProductPost( @ModelAttribute("product") Product product){
       productService.save(product);

        return "redirect:/admin/productInventory/all";
    }

    @RequestMapping("/editProduct/{productId}")
    public String editProduct(@PathVariable int productId, Model model){
        Product product = productService.findById(productId);
        model.addAttribute(product);
        return "editProduct";
    }

    @RequestMapping(value = "/editProduct", method = RequestMethod.POST)
    public String editProductPost(@ModelAttribute("product") Product product, BindingResult result){
        productService.save(product);
        return "redirect:/admin/productInventory/all";
    }




    @RequestMapping("/removeProduct/{productId}")
    public String removeProduct(@PathVariable int productId){
    Product product = productService.findById(productId);
    productService.delete(product);

        return "redirect:/admin/productInventory/all";

    }



}
