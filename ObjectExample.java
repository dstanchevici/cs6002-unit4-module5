// Unit 4, module 5, ex. 5.2 (4.5.2)

class XYPoint {

    double x;
    double y;
    
}

public class ObjectExample {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint ();

	p.x = 2;
	p.y = 3;

	double d = Math.sqrt (p.x*p.x + p.y*p.y);
	System.out.println (d);

	System.out.println (p);
    }
}
