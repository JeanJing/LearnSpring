1、spring依类库
  * SPRING_HOME/dist/spring.jar
  * SPRING_HOME/lib/jakarta-commons/commons-logging.jar自动选择使用什么日志记录
  * SPRING_HOME/lib/log4j/log4j-1.2.14.jar
2、拷贝spring配置文件到src下

3、拷贝log4j配置文件到src下

4、在userManagerImpl中提供构造函数或者set函数，spring将实例化好的userDao注入到userManager里面

5、sping管理对象的创建和依赖，必须在spring配置中定义对象之间的依赖关系

spring Ioc容器的关键点：
  必须将被管理的对象定义到spring配置文件中
  必须定义构造函数或者setter方法，使得spring可以将对象注入到指定位置