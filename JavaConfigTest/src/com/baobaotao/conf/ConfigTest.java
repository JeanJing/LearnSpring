package com.baobaotao.conf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    public static void main(String args[]){
    	//手动注册配置类
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConf.class);
        //需找类型为LogonService,名字为logonService1的bean,如果没有指定名字，默认寻找匹配的类型.
        LogonService logonService = (LogonService) ac.getBean("logonService1",LogonService.class);
        logonService.print();
    }
}