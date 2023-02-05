package _05_Polymorphs;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.jointheleague.graphical.robot.Robot;

public abstract class Polymorph implements MouseMotionListener, MouseListener {
	private int x;
	private int y;
	private int height;
	private int width;

	public Polymorph(int x, int y, int height, int width) {
		this.setX(x);
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public int getx() {
		return getX();
	}

	public int gety() {
		return y;
	}

	public int getheight() {
		return height;
	}

	public int getwidth() {
		return width;
	}

	public void setx(int x) {
		this.setX(x);
	}

	public void sety(int y) {
		this.y = y;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public void setwidth(int width) {
		this.width = width;
	}

	public abstract void update();

	public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class RedPolymorph extends Polymorph {

	public RedPolymorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {
		Robot r = new Robot();
		r.setPenColor(200, 0, 0);
		r.turn(90);
		r.move(50);
		r.turn(90);
		r.move(150);
		r.turn(90);
		r.move(50);
		r.turn(90);
		r.move(150);

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void update() {
		setx(getx() + 5);
		sety(gety() + 5);
	}

	@Override
	public void draw(Graphics g) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

class MickeyPolymorph extends Polymorph {

	public MickeyPolymorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
public int getMouseX(MouseEvent  arg0) {
	int MouseX = arg0.getX();
	return MouseX;
}

public int getMouseY(MouseEvent arg0) {
	int MouseY = arg0.getY();
	return MouseY;
	
}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {

	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

class MessagePolymorph extends Polymorph {

	public MessagePolymorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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