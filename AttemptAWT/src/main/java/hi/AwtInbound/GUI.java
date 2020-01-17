package hi.AwtInbound;

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
		
		AwtSignalImpl awtSignalImpl = new AwtSignalImpl();
		
		pJframe.addMouseListener(awtSignalImpl);
		pJframe.addMouseMotionListener(awtSignalImpl);			
	}

}
