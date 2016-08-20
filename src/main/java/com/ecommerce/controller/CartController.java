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
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alx on 8/17/2016.
 */

@Controller
@RequestMapping("/customer/cart")
@SessionAttributes("customer")
public class CartController {


    @Autowired
    CartService cartService;

    @Autowired
    CustomerService customerService;

    @Autowired
    ProductService productService;

    @Autowired
    CartItemService cartItemService;


    @ModelAttribute("customer")
    public Customer getCustomer(@AuthenticationPrincipal User activeUser) {
        return customerService.findCustomerByUsername(activeUser.getUsername());
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCart(@ModelAttribute("customer") Customer customer, Model model) {
        List<CartItem> cartItems = customer.getCart().getCartItems();
        model.addAttribute("totalPriceCart", cartService.getTotalPriceCart(customer.getCart()));
        model.addAttribute("cartItems", cartItems);


        return "cart";
    }


    @RequestMapping("/add/{productId}")
    public String addItem(@PathVariable(value = "productId") int productId, @ModelAttribute("customer") Customer customer, Model model) {

        Cart cart = customer.getCart();
        model.addAttribute("cart", cart);
        Product product = productService.findById(productId);
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
        CartItem cartItem = cartItemService.findCartItemById(cartId);
        cartItemService.removeCartItem(cartItem);
        return "redirect:/customer/cart";
    }

    @RequestMapping("/clearCart")
    public String clearCart(@ModelAttribute(value = "customer") Customer customer) {
        cartItemService.removeAllCartItems(customer.getCart());
        return "redirect:/customer/cart";
    }

}
