package hi.receiveSignalFromAWT;

import javax.swing.JFrame;

public class GUI {
	
	JFrame stage = new JFrame();

	public void createStage() {
		JFrame stage = new JFrame();
		stage.setSize(500, 500);
		stage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		stage.setVisible(true);
		
		createProtagonists(stage);	    		
	}

	private void createProtagonists(JFrame pJframe) {
		
		Signal_ImplFromAWT signal = new Signal_ImplFromAWT(); 
		
		pJframe.addMouseListener(signal);
		pJframe.addMouseMotionListener(signal);			
	}

}
