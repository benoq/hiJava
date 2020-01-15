package hi.listener;

import javax.swing.JFrame;

public class GUI {
	
	JFrame stage = new JFrame();

	public void createStage() {
		JFrame stage = new JFrame();
		stage.setSize(1000, 500);
		stage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		stage.setVisible(true);
		
		createProtagonists(stage);	    		
	}

	private void createProtagonists(JFrame pJframe) {
		
		Signal signal = new Signal();
		
		pJframe.addMouseListener(signal);
		pJframe.addMouseMotionListener(signal);			
	}

}
