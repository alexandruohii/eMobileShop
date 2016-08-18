package com.ecommerce.controller;

import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Product;
import com.ecommerce.service.CartItemService;
import com.ecommerce.service.CartService;
import com.ecommerce.service.CustomerService;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alx on 8/17/2016.
 */

@Controller
@RequestMapping("/customer/cart")
public class CartController {


    @Autowired
    CartService cartService;

    @Autowired
    CustomerService customerService;

    @Autowired
    ProductService productService;

    @Autowired
    CartItemService cartItemService;

    @RequestMapping
    public String getCart(@AuthenticationPrincipal User activeUser, Model model) {
        Customer customer = customerService.findCustomerByUsername(activeUser.getUsername());
        List<CartItem> cartItems = customer.getCart().getCartItems();
        model.addAttribute("cartItems", cartItems);

        return "cart";
    }


    @RequestMapping("/add/{productId}")
    public String addItem(@PathVariable(value = "productId") int productId, @AuthenticationPrincipal User activeUser, Model model) {
        Customer customer = customerService.findCustomerByUsername(activeUser.getUsername());
        Cart cart = customer.getCart();
        Product product = productService.findPhoneById(productId);
        List<CartItem> cartItems = cart.getCartItems();
        for (int i = 0; i < cartItems.size(); i++) {
            if (product.getProductID() == cartItems.get(i).getProduct().getProductID()) {
                CartItem cartItem = cartItems.get(i);
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                cartItem.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())));
                cartItemService.addCartItem(cartItem);
                return "redirect:/product/productList/viewProduct/{productId}";
            }
        }

        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(1);
        cartItem.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())));
        cartItem.setCart(cart);
        cartItemService.addCartItem(cartItem);
        return "redirect:/product/productList/viewProduct/{productId}";
    }

    @RequestMapping("/remove/{cartItemId}")
    public String removeItem(@PathVariable(value = "cartItemId") int cartId) {
        CartItem cartItem = cartItemService.getCartItemById(cartId);
        cartItemService.removeCartItem(cartItem);
        return "redirect:/customer/cart";
    }

}
