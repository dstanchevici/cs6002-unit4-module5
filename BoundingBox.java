// 4.5.9

import java.util.*;

class XYPoint {

    double x;
    double y;

    public XYPoint (double inputX, double inputY)
    {
	x = inputX; y = inputY;
    }

    public String toString ()
    {
	return "Point: (" + x + ", " + y + ")";
    }
    
}

public class BoundingBox {

    public static void main (String[] argv)
    {
	DrawTool.setXYRange (0,10, 0, 10);
	DrawTool.display ();

	ArrayList<XYPoint> points = new ArrayList<>();
	XYPoint p = new XYPoint (7,5);
	points.add (p);

	points.add ( new XYPoint(2,3) );
	points.add ( new XYPoint(4,6) );
	points.add ( new XYPoint(5,8) );
	points.add ( new XYPoint(3,7) );

	drawPoints (points);

	drawBoundingBox (points);
    }

    static void drawPoints (ArrayList<XYPoint> points)
    {
	for (XYPoint p: points) {
	    DrawTool.drawPoint (p.x, p.y);
	}
    }

    static void drawBoundingBox (ArrayList<XYPoint> points)
    {
	double left, right, top, bottom;
	left = right = points.get(0).x;
	top = bottom = points.get(0).y;
	
	for (int i=1; i<points.size(); i++) {
	    if (points.get(i).x < left) {
		left = points.get(i).x;
	    }
	    if (points.get(i).x > right) {
		right = points.get(i).x;
	    }
	    if (points.get(i).y < bottom) {
		bottom = points.get(i).y;
	    }
	    if (points.get(i).y > top) {
		top = points.get(i).y;
	    }
	    
	}
	DrawTool.setLineColor ("blue");
	DrawTool.drawLine (left,bottom, right,bottom);
	DrawTool.drawLine (left,top, right,top);
	DrawTool.drawLine (left,top, left,bottom);
	DrawTool.drawLine (right,top, right,bottom);
	
    }

}    
