package com.spring.learn;

public interface UserManager {
	public void addUser(String name, String password);
	public void deleteUser(int id);
	public void modifyUser(int id,String name, String password);
	public String findUserById(int id);
	
}
