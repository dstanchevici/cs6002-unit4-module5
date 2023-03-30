// 4.5.12

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
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

	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(2));
	g2.setColor (Color.black);
	// Face
	g2.drawOval (70, 90, 200, 250);
	// Eyes
	g2.drawOval (95,160, 55, 40);
	g2.drawOval (190,160, 55, 40);
	g2.fillOval (115, 175, 15, 15);
	g2.fillOval (210, 175, 15, 15);
	// Ears
	g2.drawOval (45,195, 25, 50);
	g2.drawOval (270,195, 25, 50);
	// Nose
	g2.drawOval (145,205, 50, 50);
	// Mouth
	g2.fill(new Arc2D.Double(100, 210, 140, 100, 200, 140,Arc2D.CHORD));

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
