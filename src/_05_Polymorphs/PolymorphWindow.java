package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * 1. Create new member variables for the width and height of Polymorph then 
 * initialize them in its constructor.
 * 
 * 2. Encapsulate the member variables of the Polymorph class. 
 * 
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with its width and height.
 * 
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
 * 
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
 * 
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph.
 * 
 * 7. Create a new sub-class of the Polymorph class called MovingMorph.
 * 
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen.
 * 
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.
 * 
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class.
 * 
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
 * 
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList.
 * 
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * 
 * 14. Create a Polymorph that follows your mouse. Hint: The MouseMotionListener
 *  interface.
 * 
 * 15. Create a Polymorph that displays a JOptionPane Message Dialog when
 *  clicked. Hint: MouseListener interface.
 */

public class PolymorphWindow extends JPanel implements ActionListener {

	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph moveMorph;
	Polymorph mickeePoly;
	Polymorph messPoly;
	ArrayList<Polymorph> morphList = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("POWER RANGERS, IT'S MORPHIN' TIME!!! LEEETTTTS GOOOOOOOOOOOO!!!!!!!!!!!"
				+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!123456 Red Ranger (Jason), Blue Ranger (Billy) , "
				+ "Black Ranger (Zachary), Pink Ranger (Kimberly), Yellow Ranger (Trini), Green Ranger(Tommy), goooooo!!!!"
				+ " ZORDS COMBINEEEE!!!!!!!!!!!!< MEGAZORD ATTACKKKKKKKK!$!$!$!$!$!!$!  VICOTRY IS OURRSS!!!!!!!!!@#$%^&*()");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		bluePoly = new BluePolymorph(50, 50);
		redPoly = new RedPolymorph(50, 50, getHeight(), getWidth());
		moveMorph = new MovingMorph(50, 50, getHeight(), getWidth());
		mickeePoly = new MickeyPolymorph(50, 50, getHeight(), getWidth());
		messPoly = new MessagePolymorph(50, 50, getHeight(), getWidth());
		timer = new Timer(1000 / 30, this);
		timer.start();

		morphList.add(bluePoly);
		morphList.add(moveMorph);
		morphList.add(redPoly);
		morphList.add(mickeePoly);
		morphList.add(messPoly);
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		int x = 1;
		while (x > 0) {
			bluePoly.draw(g);
			redPoly.draw(g);
			moveMorph.draw(g);
			mickeePoly.draw(g);
			messPoly.draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int y = 1;
		while (y > 0) {
			repaint();
			bluePoly.update();
			moveMorph.update();
			redPoly.update();
			mickeePoly.update();
			messPoly.update();
		}
	}
}
