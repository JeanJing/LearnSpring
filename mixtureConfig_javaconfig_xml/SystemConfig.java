package mixtureConfig_javaconfig_xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
//我不知道怎么回事，但是在引入xml文件时候，classpath:applicationContext-beans.xml或是绝对路径都不对，在classpath后面加上*竟然就可以了
@ImportResource("classpath:mixtureConfig/applicationContext-beans.xml")
public class SystemConfig {

}
