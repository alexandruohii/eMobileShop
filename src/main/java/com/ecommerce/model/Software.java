package com.ecommerce.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Alx on 8/10/2016.
 */

@Entity
@DiscriminatorValue("Software")
public class Software extends Product {
}
