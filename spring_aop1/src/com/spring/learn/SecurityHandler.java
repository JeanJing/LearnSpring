package com.spring.learn;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class SecurityHandler {
	
	/**
	 * 定义Pointcut,Pointcut的名称就是allAddMethod，此方法不能有返回值和参数，该方法只是一个
	 * 标识
	 * 
	 * Pointcut的内容是一个表达式，描述那些对象的那些方法（订阅Joinpoint）
	 */
	@Pointcut("execution(* com.spring.learn.UserManager.addUser(..)) || " +
			"execution(* com.spring.learn.UserManager.deleteUser(..))")
	private void addOrDeleteMethod(){};
	
	/**
	 * 定义Advice，标识在那个切入点何处织入此方法
	 */
	/*@Pointcut("execution(* com.spring.learn.UserManager.addUser(..)) || " +
			"execution(* com.spring.learn.UserManager.deleteUser(..))")
	private void allAdd(){
		
	}
	
	/**
	 * 定义Advice，标识在那个切入点何处织入此方法
	 */
	@Before("addOrDeleteMethod()")
	private void checkSecurity() {
		System.out.println("----------checkSecurity()---------------");
	}
	
}
