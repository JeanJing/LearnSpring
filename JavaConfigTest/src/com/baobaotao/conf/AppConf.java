package com.baobaotao.conf;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

//当通过手动注册配置类的时候，这个可以不写，如果想通过应用程序上下文获得这个bean，这个必须写
@Configuration
public class AppConf {

    // 以下两个方法定义了两个Bean，并提供了Bean的实例化逻辑
    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public LogDao logDao() {
        return new LogDao();
    }

    // 定义了LogonService的Bean,名字是logonService1
    @Bean(name="logonService1")
    public LogonService logonService() {
        LogonService logonService = new LogonService();
        // 将上面定义的Bean注入到logonService Bean中
        logonService.setLogDao(logDao());
        logonService.setUserDao(userDao());
        return logonService;
    }
    
}