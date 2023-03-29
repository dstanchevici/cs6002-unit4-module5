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

public class ObjectExample6 {

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

	// drawBoundingBox (points);
    }

    static void drawPoints (ArrayList<XYPoint> points)
    {
	for (XYPoint p: points) {
	    DrawTool.drawPoint (p.x, p.y);
	}
    }

}    
