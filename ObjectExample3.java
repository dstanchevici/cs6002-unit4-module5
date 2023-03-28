// 4.5.5


class XYPoint {

    double x;
    double y;

    public double distance (XYPoint p)
    {
	System.out.println ("In distance(): p=" + p);
	return Math.sqrt ( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) );
    }

    public String printToString ()
    {
	return "Point: (" + x + ", " + y + ")";
    }

    public XYPoint closest (XYPoint[] points)
    {
	XYPoint closest = points[0];
	for (int i=1; i<points.length; i++) {
	    if ( distance(points[i]) < distance(closest) ) {
		closest = points[i];
	    }
	}
	return closest;
    }
    
}

public class ObjectExample3 {

    public static void main (String[] argv)
    {
	// 1.
	XYPoint[] points = new XYPoint [3];

	// 2.
	points[0] = new XYPoint ();
	points[0].x = 3; points[0].y = 2;
	points[1] = new XYPoint ();
	points[1].x = 2; points[1].y = 3;
	points[2] = new XYPoint ();
	points[2].x = 6; points[2].y = 4;

	// 3.
	XYPoint p = new XYPoint ();
	p.x = 7; p.y = 5;
	System.out.println ("In main(): p=" + p);

	// 4.
	double d = p.distance(points[0]);
	System.out.println (d);

	// 5. Find closest
	XYPoint q = p.closest (points);
	System.out.println (q.printToString());
    }
}
