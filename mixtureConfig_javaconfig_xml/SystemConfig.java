package mixtureConfig_javaconfig_xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
//�Ҳ�֪����ô���£�����������xml�ļ�ʱ��classpath:applicationContext-beans.xml���Ǿ���·�������ԣ���classpath�������*��Ȼ�Ϳ�����
@ImportResource("classpath:mixtureConfig/applicationContext-beans.xml")
public class SystemConfig {

}
