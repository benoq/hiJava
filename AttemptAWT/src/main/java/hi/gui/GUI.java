package hi.gui;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import hi.receiveSignalFromAWT.Signal_ImplFromAWT;

public class GUI {
	
	private JFrame stage = new JFrame();
	private JComponent title; 

	public void createStage() {
		JFrame stage = new JFrame();
		stage.setSize(500, 500);
		stage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		stage.setVisible(true);
		
		createProtagonists(stage);
		
		stage.add(bringTitle());
	}

	private void createProtagonists(JFrame pJframe) {
		
		Signal_ImplFromAWT signal = new Signal_ImplFromAWT(); 
		
		pJframe.addMouseListener(signal);
		pJframe.addMouseMotionListener(signal);			
	}
	
	private JComponent bringTitle() {
		if (title == null) {
			VisualElement visualElement = new VisualElement();
			ImageIcon imageIcon = visualElement.createImageIcon("..\\visual\\gesture.png", "Hand");
			
			JLabel titleInFromOfLabel = new JLabel("Hand", imageIcon, JLabel.NORTH_WEST);		

			return titleInFromOfLabel;
		}
		return title;
	}

}
