package com.learn.spring.manager;

import com.learn.spring.dao.UserDao;

public class UserManagerImpl implements UserManager{
    private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	//public UserManagerImpl(UserDao userDao){
    //	this.userDao = userDao;
    //}
	public void save(String username, String password) {
		userDao.save(username, password);
		
	}

}
