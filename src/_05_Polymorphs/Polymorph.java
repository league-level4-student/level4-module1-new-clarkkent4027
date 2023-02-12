package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public abstract class Polymorph implements MouseMotionListener, MouseListener {
	protected int x;
	protected int y;
	protected int height;
	protected int width;

	public Polymorph(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public int getx() {
		return x;
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
		this.x = x;
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

}

class MickeyPolymorph extends Polymorph {

	public MickeyPolymorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	public int getMouseX(MouseEvent arg0) {
		return x;
	}

	public int getMouseY(MouseEvent arg0) {
		return y;
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
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
		g.setColor(Color.CYAN);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
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
		JOptionPane.showMessageDialog(null, "MEssAGe polYmorph wUz heRe!");
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