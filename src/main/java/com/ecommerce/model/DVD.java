package com.ecommerce.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Alx on 8/9/2016.
 */

@Entity
@DiscriminatorValue("DVD")
public class DVD extends Product {
}
