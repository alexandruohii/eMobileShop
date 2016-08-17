package com.ecommerce.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by Alx on 8/15/2016.
 */

@Entity
public class ShippingAddress {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="Id")
    private int shippingId;

    @NotEmpty(message = "The street field can't be empty")
    private String street;

    @NotEmpty (message = "The streetnumber field can't be empty")
    private String streetNumber;

    @NotEmpty (message = "The city field can't be empty")
    private String city;

    @NotEmpty (message = "The county field can't be empty")
    private String county;

    @NotEmpty (message = "The country field can't be empty")
    private String country;


    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
