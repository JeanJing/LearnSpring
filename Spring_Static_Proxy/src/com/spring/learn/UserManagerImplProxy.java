package com.spring.learn;

public class UserManagerImplProxy implements UserManager {
	private UserManager userManager;
	
	public UserManagerImplProxy(UserManager userManager){
		this.userManager = userManager;
	}
	public void addUser(String name, String password) {
		checkSecurity();
		userManager.addUser(name, password) ;
	}

	public void deleteUser(int id) {
		checkSecurity();
		userManager.deleteUser(id);
	}

	public void modifyUser(int id, String name, String password) {
		checkSecurity();
		userManager.modifyUser(id, name, password) ;
	}

	public String findUserById(int id) {
		checkSecurity();
		userManager.findUserById(id);
		return null;
	}
    public void checkSecurity(){
    	System.out.println("---checkSecurity---");
    }

}
