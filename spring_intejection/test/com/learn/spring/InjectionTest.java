package com.learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class InjectionTest extends TestCase {
    private BeanFactory factory;
	protected void setUp() throws Exception {
		 factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	public void testInjection(){
		Bean1 bean1 = (Bean1)factory.getBean("bean1");
		System.out.println("bean1.strValue  " + bean1.getStrValue());
		System.out.println("bean1.intValue  " + bean1.getIntValue());
		System.out.println("bean1.listValue  " + bean1.getListValue());
		System.out.println("bean1.setValue  " + bean1.getSetValue());
		int []strs = bean1.getArrayValue();
		System.out.println("bean1.arrayValue:" );
		for(int i = 0; i < strs.length; i++)
			System.out.println(strs[i]);
		System.out.println("bean1.mapValue  " + bean1.getMapValue());
		
	}

	
	

}
