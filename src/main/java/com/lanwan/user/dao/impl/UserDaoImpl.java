package com.lanwan.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.lanwan.user.dao.UserDao;
import com.lanwan.user.model.User;
import com.lanwan.util.hibernate.BaseDao;

@Repository(value = "userDao")
public class UserDaoImpl extends BaseDao<User> implements UserDao {

	@Override
	public void addUser(User user) {
		
	}


}
