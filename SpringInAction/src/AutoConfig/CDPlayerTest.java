package AutoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerTest {
	//@Autowired
	private static CDPlayer cdp;
	
	
	public static void main(String args[]){
		AnnotationConfigApplicationContext fc = new 
				AnnotationConfigApplicationContext(CDPlayerConfig.class);
		cdp = (CDPlayer) fc.getBean("cdplayer1");
	    cdp.play();
	    System.out.println(cdp.getCd());
	}
	
}
