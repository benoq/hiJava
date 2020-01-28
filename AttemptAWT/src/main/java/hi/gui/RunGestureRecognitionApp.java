package hi.gui;

import java.net.MalformedURLException;

import hi.gui.GUI;
import javafx.application.Platform;

public class RunGestureRecognitionApp
{
    public static void main( String[] args ) throws MalformedURLException
    {
		//enable javaFx elements by starting up the platform
    	try {
			Platform.startup(() ->			{
			    // This block will be executed on JavaFX Thread
			});
		} catch (Exception e) {
			Platform.runLater(null);
		}
    
       //my used AWT implementation
       GUI GUI = new GUI();
       GUI.createStage();
    }
}
