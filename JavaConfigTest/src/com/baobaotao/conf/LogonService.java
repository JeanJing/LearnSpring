package com.baobaotao.conf;
public class LogonService {
    public UserDao userDao;

    public LogDao logDao;

    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void print() {
        System.out.println("helloworld");
    }
}