package hi.receiveSignalFromAWT;

import java.awt.Point;
import java.util.ArrayList;

import hi.action.Intention;	

public class SequenceIntentionMapper {
	
	public Intention mapSequenceToIntention(SignalSequence pSignalSequence) {
		Intention intention = new Intention();
		ArrayList<Point> signalToInterpret = pSignalSequence.getSumOfSignals();
		intention = checkForIntentionOfSignal(signalToInterpret);
		return intention;
	}

	private Intention checkForIntentionOfSignal(ArrayList<Point> pSignalToInterpret) {
		Intention intention = new Intention();
		
//		pSignalToInterpret.forEach(point -> System.out.println("x : " + point.getX() + " y : " + point.getY()));
		
		boolean northWestmovement = true;  //fastTest
		
		for (int i = 0; i < pSignalToInterpret.size(); i++) {
			
			double xOrigin = pSignalToInterpret.get(i).getX();
			double yOrigin = pSignalToInterpret.get(i).getY();
			
			// watch movements of the signal
			if (i < pSignalToInterpret.size() -1 ) {
				double xNextStep = pSignalToInterpret.get(i+1).getX();
				double yNextStep = pSignalToInterpret.get(i+1).getY();
				
				// TODO: here, hiddenMarkov or any similar Interpretation algorithms have to placed
				// the is a very simple check for a continuous movement to North-West
				if(!(xNextStep >= xOrigin) && !(yNextStep <= yOrigin)) {   //fastTest
					northWestmovement = false;
				}
			}			
		}
		
		if (northWestmovement) {
		  intention.setIntentionUnderstood(true); 	
		}
		
	    return intention;		
	}

}
