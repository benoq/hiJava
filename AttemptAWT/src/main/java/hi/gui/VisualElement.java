package hi.gui;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;

import hi.action.Constants;

public class VisualElement {

	public ImageIcon createImageIcon(String path, String description) throws MalformedURLException {

		URL visualURL = new File(Constants.pathForVisualFile_Hand).toURI().toURL();

		if (visualURL != null) {
			return new ImageIcon(visualURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

}
