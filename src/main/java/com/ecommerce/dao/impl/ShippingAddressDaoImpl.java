package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.ShippingAddressDao;
import com.ecommerce.model.ShippingAddress;
import org.springframework.stereotype.Repository;

/**
 * Created by Alx on 8/20/2016.
 */

@Repository
public class ShippingAddressDaoImpl extends AbstractDao<ShippingAddress, Integer> implements ShippingAddressDao {
}
