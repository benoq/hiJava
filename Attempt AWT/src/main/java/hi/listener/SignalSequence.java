package hi.listener;

import java.awt.Point;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;

import hi.action.Intention;
import hi.action.IntentionExpressionMapper;
import hi.action.ExpressionSoundMapper;
import hi.action.Sound;


public class SignalSequence {

	private Date startPoint;
	private Date endPoint;
	private ArrayList<Point> sumOfSignals;
	
	public static void callForMapping(SignalSequence pSignalSequence) throws MalformedURLException, Exception {
		SequenceIntentionMapper sim = new SequenceIntentionMapper();
		Intention I = sim.mapSequenceToIntention(pSignalSequence);
		
		ExpressionSoundMapper ism = new ExpressionSoundMapper();
		
		Sound.createSound(ism.mapRequestToSound(IntentionExpressionMapper.mapIntentionToExpression(I)));
	}
	
	public SignalSequence(ArrayList<Point> sumOfSignals) {
		this.sumOfSignals = sumOfSignals;
	}
	
	public SignalSequence getInstance() {
		return this;
	}

	public Date getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Date startPoint) {
		this.startPoint = startPoint;
	}

	public Date getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Date endPoint) {
		this.endPoint = endPoint;
	}

	public ArrayList<Point> getSumOfSignals() {
		return sumOfSignals;
	}

	public void setSumOfSignals(ArrayList<Point> sumOfSignals) {
		this.sumOfSignals = sumOfSignals;
	}
	
	public static void storeSequence(Point pPoint) {
		
	}
	
}
