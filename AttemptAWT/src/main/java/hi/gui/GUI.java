package hi.gui;

import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import hi.receiveSignalFromAWT.Signal_ImplFromAWT;

public class GUI {
	
	private JFrame stage = new JFrame();
	private JComponent title; 

	public void createStage() throws MalformedURLException {
		JFrame stage = new JFrame();
		stage.setSize(500, 500);
		stage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stage.setTitle("GestureRecognitionApp");
		
		stage.setVisible(true);
		
		createProtagonists(stage);
		
		stage.add(bringTitle());
	}

	private void createProtagonists(JFrame pJframe) {
		
		Signal_ImplFromAWT signal = new Signal_ImplFromAWT(); 
		
		pJframe.addMouseListener(signal);
		pJframe.addMouseMotionListener(signal);			
	}
	
	private JComponent bringTitle() throws MalformedURLException {
		if (title == null) {
			// disable picture in label as long as the ressource not found error exists
//			VisualElement visualElement = new VisualElement();
//			ImageIcon imageIcon = visualElement.createImageIcon("..\\visual\\gesture.png", "Hand");
			
//			JLabel titleInFromOfLabel = new JLabel("Hand", imageIcon, JLabel.NORTH_WEST);
			JLabel titleInFromOfLabel = new JLabel("Hand", JLabel.NORTH_WEST);

			return titleInFromOfLabel;
		}
		return title;
	}

}
