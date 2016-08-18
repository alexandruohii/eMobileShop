package com.ecommerce.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Alx on 8/15/2016.
 */

@Entity
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "customerId")
    private int customerId;

    @NotEmpty (message = "The username field can't be empty")
    private String username;


    @Size (min = 6 , max = 12 ,message = "The password must be between 6 and 12 characters long")
    private String password;

    //@NotEmpty (message = "The name field can't be empty")
    private String name;

   /* @NotEmpty (message = "The email field can't be empty")
    @Email (message = "Please provide a valid email address")
    @Pattern(regexp=".+@.+\\..+", message = "")*/
    private String email;

    private int phone;

    @Valid
    @OneToOne(mappedBy = "customer")
    private BillingAddress billingAddress;

    @Valid
    @OneToOne(mappedBy = "customer")
    private ShippingAddress shippingAddress;

    @OneToOne(mappedBy = "customer")
    private Cart cart;

    //private boolean isActive;


    public int getIdCustomer() {
        return customerId;
    }

    public void setIdCustomer(int customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
