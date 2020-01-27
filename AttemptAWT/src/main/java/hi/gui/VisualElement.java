package hi.gui;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;

import hi.action.Constants;

public class VisualElement {

	public ImageIcon createImageIcon(String path, String description) {
		String s = getClass().toString();
		URL imgURL = getClass().getResource(path);
		try {
			URL visualURL = new File(Constants.pathForVisualFile_Hand).toURI().toURL();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

}
