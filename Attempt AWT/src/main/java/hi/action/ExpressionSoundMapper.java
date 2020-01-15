package hi.action;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ExpressionSoundMapper {

	public URL mapRequestToSound (Expression pExpression) throws MalformedURLException {
	    URL soundURL = null;
		
		switch(pExpression) {
		case YES:
			soundURL = new File("C:\\Users\\BenG\\git\\hi\\Attempt AWT\\src\\sound\\yes.wav").toURI().toURL();
		}
		return soundURL;
	}
	
}
