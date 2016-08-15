package com.ecommerce.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Alx on 8/9/2016.
 */
@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id")
    int productID;

    String phoneType;
    String name;
    BigDecimal price;
    String brand;
    String description;
    String slimSlots;
    String touchscreen;
    String color;
    String simType;
    String otherOptions;
    String phoneLink;

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
}
