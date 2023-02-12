package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y, int height, int width) {
		super(x, y, width, height);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		setx(getx() + 5);
		sety(gety() + 5);
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
