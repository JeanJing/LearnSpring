package com.baobaotao.conf;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

//��ͨ���ֶ�ע���������ʱ��������Բ�д�������ͨ��Ӧ�ó��������Ļ�����bean���������д
@Configuration
public class AppConf {

    // ����������������������Bean�����ṩ��Bean��ʵ�����߼�
    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public LogDao logDao() {
        return new LogDao();
    }

    // ������LogonService��Bean,������logonService1
    @Bean(name="logonService1")
    public LogonService logonService() {
        LogonService logonService = new LogonService();
        // �����涨���Beanע�뵽logonService Bean��
        logonService.setLogDao(logDao());
        logonService.setUserDao(userDao());
        return logonService;
    }
    
}