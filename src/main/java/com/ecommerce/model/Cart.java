package com.ecommerce.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx on 8/15/2016.
 */

@Entity
@Table (name = "Cart")
public class Cart {



    @Id
    @GeneratedValue
    @Column (name = "cartId")
    private int cartId;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItems ;

    @OneToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @Column (name = "cartPrice")
    private BigDecimal cartPrice;
}
