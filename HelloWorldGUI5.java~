// 4.5.15

import java.awt.*;
import java.awt.event.*;
//import java.awt.geom.Arc2D;
import javax.swing.*;
import javax.swing.event.*;

class DrawPanel extends JPanel {

    int fontSize = 12;
    int diameter = 150;

    public void paintComponent (Graphics g)
    {
	super.paintComponent (g);

	Dimension D = this.getSize();
	g.setColor (Color.white);
	g.fillRect (0,0, D.width,D.height);

	Font f = new Font ("Serif", Font.PLAIN, fontSize);
	g.setFont (f);
	g.setColor (Color.blue);
	g.drawString ("Hello World!", 100, 100);

	g.setColor (Color.red);
	g.drawOval (200, 200, diameter, diameter);
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
	    drawPanel.diameter += 10;
	}
	else if (buttonName.equals ("Smaller")) {
	    drawPanel.fontSize -= 2;
	    drawPanel.diameter -= 10;
	}
	else {
	    System.out.println ("ERROR: no such button");
	}
	drawPanel.repaint ();
    }
}


public class HelloWorldGUI4 {

    public static void main (String[] argv)
    {
	HelloWorldFrame f = new HelloWorldFrame ();
    }
}
