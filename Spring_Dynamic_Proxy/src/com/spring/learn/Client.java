package com.spring.learn;

public class Client {

	public static void main(String[] args) {
		SecurityHandler handler = new SecurityHandler();
		UserManager userManager = (UserManager)handler.newProxy(new UserManagerImpl());
		userManager.addUser("ÕÅÈı", "123");
		

	}

}
