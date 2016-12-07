package com.spring.learn;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class SecurityHandler {
	
	/**
	 * ����Pointcut,Pointcut�����ƾ���allAddMethod���˷��������з���ֵ�Ͳ������÷���ֻ��һ��
	 * ��ʶ
	 * 
	 * Pointcut��������һ�����ʽ��������Щ�������Щ����������Joinpoint��
	 */
	@Pointcut("execution(* com.spring.learn.UserManager.addUser(..)) || " +
			"execution(* com.spring.learn.UserManager.deleteUser(..))")
	private void addOrDeleteMethod(){};
	
	/**
	 * ����Advice����ʶ���Ǹ������δ�֯��˷���
	 */
	/*@Pointcut("execution(* com.spring.learn.UserManager.addUser(..)) || " +
			"execution(* com.spring.learn.UserManager.deleteUser(..))")
	private void allAdd(){
		
	}
	
	/**
	 * ����Advice����ʶ���Ǹ������δ�֯��˷���
	 */
	@Before("addOrDeleteMethod()")
	private void checkSecurity() {
		System.out.println("----------checkSecurity()---------------");
	}
	
}
