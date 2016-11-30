package mixtureConfig_javaconfig_xml;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer implements MediaPlalyer{
	private CompactDisc cd;
	public CompactDisc getCd() {
		return cd;
	}
	//@Autowired(required = false)
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	//@Autowired

    public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	public void play() {
		cd.play();
		
	}
	
}
