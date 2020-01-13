package hi.listener;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Date;


public class Signal_Sequence {

	private Date startPoint;
	private Date endPoint;
	private ArrayList<Point> sumOfSignals;
	
	public Signal_Sequence(ArrayList<Point> sumOfSignals) {
		this.sumOfSignals = sumOfSignals;
	}
	
	public Signal_Sequence getInstance() {
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
