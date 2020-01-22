package hi.action;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import org.pmw.tinylog.Logger;

import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sound {
	
	public static void createSound(URL pResourceLocation) throws Exception {
	   
		boolean doesURLpointToWave = pResourceLocation.toString().contains(".wav");  //TODO if this is ever kept in that manner, do it right an check ending of string
		boolean doesURLpointToMP3  = pResourceLocation.toString().contains(".mp3");
		
		if(pResourceLocation != null && doesURLpointToWave) {
		    Clip clip = AudioSystem.getClip();
		    AudioInputStream ais = AudioSystem.getAudioInputStream(pResourceLocation);
		    clip.open(ais);
		    clip.start();
		}
		else if(pResourceLocation != null && doesURLpointToMP3){

			Media media = new Media(pResourceLocation.toURI().toString());
			MediaPlayer mediaPlayer = new MediaPlayer(media);
			mediaPlayer.play();
		}
		else {
			Logger.info("No sound found!");
			// TODO Log Error
		}
		
	}
}
