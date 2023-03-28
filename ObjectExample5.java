// 4.5.8


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

    public String toString ()
    {
	return "Point: (" + x + ", " + y + ")";
    }
    
}

public class ObjectExample5 {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint (7, 5);
	
	System.out.println (p.toString());
	System.out.println (p);	

	String s = "The point p: " + p;
	System.out.println (s);
    }
}
