package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {

	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	static Polymorph bluePoly = new BluePolymorph(50, 50);
	static Polymorph redPoly = new RedPolymorph(175, 175, 50, 50);
	static Polymorph moveMorph = new MovingMorph(250, 250, 50, 50);
	static Polymorph mickeePoly = new MickeyPolymorph(350, 350, 50, 50);
	static Polymorph messPoly = new MessagePolymorph(400, 400, 50, 50);

	static ArrayList<Polymorph> morphList = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
		morphList.add(bluePoly);
		morphList.add(moveMorph);
		morphList.add(redPoly);
		morphList.add(mickeePoly);
		morphList.add(messPoly);

	}

	public void buildWindow() {
		timer = new Timer(1000 / 30, this);
		timer.start();
		window = new JFrame("POWER RANGERS, IT'S MORPHIN' TIME!!! LEEETTTTS GOOOOOOOOOOOO!!!!!!!!!!!"
				+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!123456 Red Ranger (Jason), Blue Ranger (Billy) , "
				+ "Black Ranger (Zachary), Pink Ranger (Kimberly), Yellow Ranger (Trini), Green Ranger(Tommy), goooooo!!!!"
				+ " ZORDS COMBINEEEE!!!!!!!!!!!!< MEGAZORD ATTACKKKKKKKK!$!$!$!$!$!!$!  VICOTRY IS OURRSS!!!!!!!!!@#$%^&*()");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.addMouseMotionListener(this);
		window.addMouseListener(this);
		window.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(0, 0, 900, 600);
		g.fillRect(0, 0, 900, 600);

		// draw polymorph

		bluePoly.draw(g);
		redPoly.draw(g);
		moveMorph.draw(g);
		mickeePoly.draw(g);
		messPoly.draw(g);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();
		bluePoly.update();
		moveMorph.update();
		redPoly.update();
		mickeePoly.update();
		messPoly.update();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
mickeePoly.x = e.getX();
mickeePoly.y = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getX()>420 && e.getX()<470 && e.getY()>420 && e.getY()<470 ){
			JOptionPane.showMessageDialog(null, "MEssAGe polYmorph wUz heRe!");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
