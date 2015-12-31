package com.lanwan.user.dao.impl;

import com.lanwan.user.dao.UserDao;
import com.lanwan.user.model.User;
import com.lanwan.util.hibernate.BaseDao;

public class UserDaoImpl extends BaseDao<User> implements UserDao{

	public void addUser(User user) {
		this.save(user);
	}

}
