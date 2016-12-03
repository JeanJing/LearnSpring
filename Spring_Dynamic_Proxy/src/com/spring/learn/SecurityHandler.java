package com.spring.learn;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class SecurityHandler implements InvocationHandler{
    private Object targertObject;
    public Object newProxy(Object targertObject){
    	this.targertObject = targertObject;
    	return Proxy.newProxyInstance(targertObject.getClass().getClassLoader(),
    			targertObject.getClass().getInterfaces(), this);
    }
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		checkSecurity();
		Object result = null;
		try{
			result = method.invoke(this.targertObject, args);
		}catch(Exception e){
			e.printStackTrace();
			throw new java.lang.RuntimeException();
		}
		return result;
	}
	public void checkSecurity(){
    	System.out.println("---checkSecurity---");
    }

	

}
