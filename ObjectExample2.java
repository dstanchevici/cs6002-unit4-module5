// 4.5.3

class XYPoint {

    double x;
    double y;

    public double distance ()
    {
	double d = Math.sqrt (x*x + y*y);
	return d;
    }
    
}

public class ObjectExample2 {

    static XYPoint q;
    static double d;

    public static void main (String[] argv)
    {
	// 1.
	XYPoint p = new XYPoint ();
	p.x = 2;
	p.y = 3;

	// 2.
	d = p.distance ();
	// 3.
	System.out.println (d);

	// 4.
	q = p;
	// 5.
	q.x = 1;
	
	System.out.println (q.x);
	System.out.println (p.x);	
    }
}
