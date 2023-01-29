package _05_Polymorphs;

import java.awt.Graphics;

import org.jointheleague.graphical.robot.Robot;

public abstract class Polymorph {
	private int x;
	private int y;
	private int height;
	private int width;

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

class RedPolymorph extends Polymorph {

	public RedPolymorph(int x, int y, int height, int width) {
		super(x, y, height, width);
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
	public void update() {

	}

}

class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {

	}

}
