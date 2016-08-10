package com.ecommerce.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Alx on 8/9/2016.
 */
@Entity
@Table(name = "product")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")


@AttributeOverride(name = "type",
        column = @Column(name="type", nullable = false, length = 8,
                insertable = false, updatable = false))
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id")
    int productID;

    @Column(name = "name")
    String name;

    @Column(name="type", nullable=false, length=8)
    String type;

    @Column(name = "price")
    BigDecimal price;


    @Column(name = "brand")
    String brand;

    @Column(name = "description")
    String description;


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
