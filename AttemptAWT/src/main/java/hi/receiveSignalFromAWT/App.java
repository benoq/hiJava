package hi.receiveSignalFromAWT;

import hi.gui.GUI;
import javafx.application.Platform;

public class App 
{
    public static void main( String[] args )
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
