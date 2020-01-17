package hi.action;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ExpressionSoundMapper {

	public URL mapRequestToSound (Expression pExpression) throws MalformedURLException {
	    URL soundURL = null;
		
		switch(pExpression) {
		case YES:
			soundURL = new File(constants.pathForSoundFile_yes).toURI().toURL();
			break;
		case UNDEFINED_EXPRESSION:
			soundURL = new File(constants.pathForSoundFile_unbekannteGeste).toURI().toURL();
			break;
		}
		return soundURL;
	}
	
}
