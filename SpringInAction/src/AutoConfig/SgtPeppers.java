package AutoConfig;
import org.springframework.stereotype.Component;
import javax.inject.Named;

@Named("sgtPeppers1")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
	public void play() {
		System.out.println("Playing " + title + "by" + artist);
	}

}
