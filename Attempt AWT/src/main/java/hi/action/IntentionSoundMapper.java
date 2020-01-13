package hi.action;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class IntentionSoundMapper {

	public URL mapRequestToSound (Intention pIntention) throws MalformedURLException {
	    URL soundURL = null;
		
		switch(pIntention) {
		case YES:
			soundURL = new File("C:\\Users\\BenG\\Desktop\\eclipse_HI\\Attempt AWT\\src\\sound\\yes.wav").toURI().toURL();
		}
		return soundURL;
	}
	
}
