package hi.action;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.*;

public class Sound {
	
	public void createSound(URL pResourceLocation) throws Exception {
	    
	    Clip clip = AudioSystem.getClip();
	    AudioInputStream ais = AudioSystem.getAudioInputStream(pResourceLocation);
	    clip.open(ais);
	}
}
