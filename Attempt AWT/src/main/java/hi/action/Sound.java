package hi.action;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.*;

public class Sound {
	
	public static void createSound(URL pResourceLocation) throws Exception {
	   
		if(pResourceLocation != null) {
		    Clip clip = AudioSystem.getClip();
		    AudioInputStream ais = AudioSystem.getAudioInputStream(pResourceLocation);
		    clip.open(ais);
		    clip.start();
		}
		else {
			// TODO Log Error
		}
		
	}
}
