// 4.5.7


class XYPoint {

    double x;
    double y;

    // Consctructor
    public XYPoint (double inputX, double inputY)
    {
	System.out.println ("We're in the constructor");
	if ( (inputX >= 0) && (inputY >= 0) ) {
	    x = inputX; y = inputY;
	}
	else {
	    x = 0; y = 0;
	}
    }

    public double distance (XYPoint p)
    {
	return Math.sqrt ( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) );
    }

    public String printToString ()
    {
	return "Point: (" + x + ", " + y + ")";
    }
    
}

public class ObjectExample4 {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint (7, 5);
	XYPoint q = new XYPoint (3, 2);	

	System.out.println (p.printToString());
	System.out.println (q.printToString());	
	System.out.println ("Distance between p and q: " +p.distance(q));

	XYPoint r = new XYPoint ();
    }
}
