// 4.5.12

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class DrawPanel extends JPanel {

    public void paintComponent (Graphics g)
    {
	super.paintComponent (g);
	Dimension D = this.getSize();
	g.setColor (Color.white);
	g.fillRect (0,0, D.width,D.height);

	g.setFont(g.getFont().deriveFont(22f));
	g.setColor (Color.blue);
	g.drawString ("Hello World!", 350, 200);

	g.setColor (Color.black);
	g.drawOval (70, 90, 200, 250);
    }
    
}

class HelloWorldFrame extends JFrame {

    DrawPanel drawPanel;

    public HelloWorldFrame () // Constructor
    {
	setSize (500,500);
	Container cPane = this.getContentPane();
	drawPanel = new DrawPanel ();
	cPane.add (drawPanel, BorderLayout.CENTER);
	setVisible (true);
    }
}

public class HelloWorldGUI3 {

    public static void main (String[] argv)
    {
	HelloWorldFrame f = new HelloWorldFrame ();
    }

}
