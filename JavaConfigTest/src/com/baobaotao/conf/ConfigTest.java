package com.baobaotao.conf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    public static void main(String args[]){
    	//�ֶ�ע��������
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConf.class);
        //��������ΪLogonService,����ΪlogonService1��bean,���û��ָ�����֣�Ĭ��Ѱ��ƥ�������.
        LogonService logonService = (LogonService) ac.getBean("logonService1",LogonService.class);
        logonService.print();
    }
}