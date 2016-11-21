package com.learn.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.dao.UserDao4MySqlImpl;
import com.learn.spring.manager.UserManager;
import com.learn.spring.manager.UserManagerImpl;

public class Client {
	public static void main(String[] args) {
		//UserManager userManager = new UserManagerImpl(new UserDao4MySqlImpl());
		//userManager.save("张三", "123");
        //首先装载类
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserManager userManager = (UserManager) factory.getBean("userManager");
	    userManager.save("jing", "198");
	}

}
