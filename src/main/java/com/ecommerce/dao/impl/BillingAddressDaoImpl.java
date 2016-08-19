package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.BillingAddressDao;
import com.ecommerce.model.BillingAddress;
import org.springframework.stereotype.Repository;

/**
 * Created by Alx on 8/20/2016.
 */

@Repository
public class BillingAddressDaoImpl extends AbstractDao<BillingAddress, Integer> implements BillingAddressDao {
}
