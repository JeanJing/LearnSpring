package mixtureConfig_javaconfig_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String args[]){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(mixtureConfig_javaconfig_xml.SystemConfig.class);
		CDPlayer cd = (CDPlayer) ac.getBean("cdPlayer");
		BlankDisc bd = (BlankDisc)ac.getBean("blankDisc");
		cd.play();
		bd.play();
		//BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext-beans.xml");
		//BlankDisc bd = (BlankDisc)factory.getBean("blankDisc");
		//bd.play();
		
	}
}
