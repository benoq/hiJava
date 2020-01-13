package hi.listener;

import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;

public class HiDragGestureListener implements DragGestureListener  {

	public void dragGestureRecognized(DragGestureEvent rec) {
		System.out.print("in method dragGestureRecognized");
		
		rec.getDragAction();
		rec.getSourceAsDragGestureRecognizer();
	}

}
