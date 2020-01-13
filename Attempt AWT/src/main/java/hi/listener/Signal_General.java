package hi.listener;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Signal_General implements MouseListener, MouseMotionListener{
	
	private Signal_Sequence memberSignal;

	public Signal_Sequence getMemberSignal() {
		return memberSignal;
	}

	public void setMemberSignal(Signal_Sequence memberSignal) {
		this.memberSignal = memberSignal;
	}

	public void mousePressed(MouseEvent e) {
		
		ArrayList<Point> signalsOfTheMouseMovement =  new ArrayList<Point>();
		Signal_Sequence sequenceInitialisation = new Signal_Sequence(signalsOfTheMouseMovement);
		setMemberSignal(sequenceInitialisation);
//		System.out.println("event: "+ e.toString());		
		System.out.println("Sequence created: "+ sequenceInitialisation.toString());		
		System.out.println("Pressed on x: "+e.getX() + ", y:"+e.getY());	
	}
	
	public void mouseDragged(MouseEvent e) {
		Signal_Sequence sequenceThatCouldBeGesture = getMemberSignal(); 
	
		System.out.println("Dragging x: "+e.getX() + ", y:"+e.getY());
//		System.out.println("   Point saved in sequence: "+sequenceThatCouldBeGesture);	
		Point currentPoint = new Point(e.getX(), e.getY() );
		sequenceThatCouldBeGesture.getSumOfSignals().add(currentPoint);
	}
	
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released on x: "+e.getX() + ", y:"+e.getY());	
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}





}
