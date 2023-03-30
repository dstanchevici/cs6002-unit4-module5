// 4.5.16

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import javax.swing.*;
import javax.swing.event.*;

class DrawPanel extends JPanel {

    int fontSize = 12;
    int delta = 1;

    public void paintComponent (Graphics g)
    {
	super.paintComponent (g);

	Dimension D = this.getSize();
	g.setColor (Color.white);
	g.fillRect (0,0, D.width,D.height);
	
	// Inscription
	Font f = new Font ("Serif", Font.PLAIN, fontSize);
	g.setFont (f);
	g.setColor (Color.blue);
	g.drawString ("Hello World!",50, 50);

	// Image
	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(2));
	g2.setColor (Color.black);
	// Face
	g2.drawOval (70+delta, 90+delta, 200+delta, 250+delta);
	// Eyes
	g2.drawOval (95+delta,160+delta, 55+delta, 40+delta);
	g2.drawOval (190+delta,160+delta, 55+delta, 40+delta);
	g2.fillOval (115+delta, 175+delta, 15+delta, 15+delta);
	g2.fillOval (210+delta, 175+delta, 15+delta, 15+delta);
	// Ears
	g2.drawOval (45+delta,195+delta, 25+delta, 50+delta);
	g2.drawOval (270+delta,195+delta, 25+delta, 50+delta);
	// Nose
	g2.drawOval (145+delta,205+delta, 50+delta, 50+delta);
	// Mouth
	g2.fill(new Arc2D.Double(100+delta, 210+delta, 140+delta, 100+delta, 200, 140,Arc2D.CHORD));
    }
}


class HelloWorldFrame extends JFrame implements ActionListener {

    DrawPanel drawPanel;

    public HelloWorldFrame () // Constructor
    {
	setSize (500,500);
	Container cPane = this.getContentPane();

	// Where drawing occurs
	drawPanel = new DrawPanel ();
	cPane.add (drawPanel, BorderLayout.CENTER);

	// Panel (container for buttons) and buttons
	JPanel panel = new JPanel ();
	
	JButton b = new JButton ("Bigger");
	b.addActionListener (this);
	panel.add (b);

	JButton b2 = new JButton ("Smaller");
	b2.addActionListener (this);
	panel.add (b2);

	JButton b3 = new JButton ("Quit");
	b3.addActionListener (this);
	panel.add (b3);

	// Add panel with two buttons to bottom
	cPane.add (panel, BorderLayout.SOUTH);

	// Make frame visible
	setVisible (true);
    }

    //Method for reacting to user's clicks
    public void actionPerformed (ActionEvent a)
    {
	String buttonName = a.getActionCommand ();
	if (buttonName.equals ("Bigger")) {
	    drawPanel.fontSize += 2;
	    drawPanel.delta += 1;
	}
	else if (buttonName.equals ("Smaller")) {
	    drawPanel.fontSize -= 2;
	    drawPanel.delta -= 1;
	}
	else if (buttonName.equals ("Quit")) {
	    System.exit(0);
	}
	else {
	    System.out.println ("ERROR: no such button");
	}
	drawPanel.repaint ();
    }
}


public class HelloWorldGUI5 {

    public static void main (String[] argv)
    {
	HelloWorldFrame f = new HelloWorldFrame ();
    }
}
