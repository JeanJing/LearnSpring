package com.spring.learn;

public class Client {

	public static void main(String[] args) {
		UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
		userManager.addUser("ÕÅÈı", "123");
		

	}

}
