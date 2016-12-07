package com.spring.learn;

public class UserManagerImpl implements UserManager{

	public void addUser(String name, String password) {
		System.out.println("------UserManagerImpl.addUser------");
		
	}

	public void deleteUser(int id) {
		System.out.println("------UserManagerImpl.deleteUser------");
	}

	public void modifyUser(int id, String name, String password) {
		System.out.println("------UserManagerImpl.modifyUser------");
	}

	public String findUserById(int id) {
		System.out.println("------UserManagerImpl.findUserById------");
		return null;
	}

}
