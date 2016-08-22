package com.ecommerce.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alx on 8/9/2016.
 */
@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue
    @Column(name = "productId")
    int productID;

    @NotEmpty(message = "Please choose a phone type")
    String phoneType;

    @NotEmpty(message = "The name field can't be empty")
    String name;


    @NotNull(message = "The price field can't be empty")
    @DecimalMin(value = "0.00", message = "The price must be a positive number")
    BigDecimal price;

    @NotEmpty(message = "The brand field can't be empty")
    String brand;

    String description;

    @NotEmpty(message = "Please choose an option")
    String slimSlots;

    @NotEmpty(message = "Please choose an option")
    String touchscreen;

    @NotEmpty(message = "The color field can't be empty")
    String color;

    @NotEmpty(message = "The sim type field can't be empty")
    String simType;
    String otherOptions;
    String phoneLink;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<CartItem> cartItemList;

    /*@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrderItem> orderItemList;*/

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlimSlots() {
        return slimSlots;
    }

    public void setSlimSlots(String slimSlots) {
        this.slimSlots = slimSlots;
    }

    public String getTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(String touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSimType() {
        return simType;
    }

    public void setSimType(String simType) {
        this.simType = simType;
    }

    public String getOtherOptions() {
        return otherOptions;
    }

    public void setOtherOptions(String otherOptions) {
        this.otherOptions = otherOptions;
    }

    public String getPhoneLink() {
        return phoneLink;
    }

    public void setPhoneLink(String phoneLink) {
        this.phoneLink = phoneLink;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
/*
    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }*/
}
