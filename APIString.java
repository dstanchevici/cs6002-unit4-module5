// Exercises in API

public class APIString {

    public static void main (String[] argv)
    {
	String s = "Hello World!";
	char c = s.charAt (1);
	System.out.println (c);

	String s2 = "How are you?";
	int k = s2.compareTo (s);
	System.out.println (k);

	String s3 = "Hello World!";
	k = s.compareTo (s3);
	System.out.println (k);
    }
}
