package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.UsersDao;
import com.ecommerce.model.Users;
import org.springframework.stereotype.Repository;

/**
 * Created by Alx on 8/20/2016.
 */
@Repository
public class UsersDaoImpl extends AbstractDao<Users,Integer> implements UsersDao {
}
