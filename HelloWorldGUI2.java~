// 4.5.11

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class DrawPanel extends JPanel {

    public void paintComponent (Graphics g)
    {
	super.paintComponent (g);

	g.drawString ("Hello World!", 100, 120);
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

public class HelloWorldGUI {

    public static void main (String[] argv)
    {
	HelloWorldFrame f = new HelloWorldFrame ();
    }

}
