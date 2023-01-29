package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph {

	public BluePolymorph(int x, int y) {
		super(x, y, 50, 50);
		setwidth(50);
		setheight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getx(), gety(), getheight(), getwidth());
	}

	@Override
	public void update() {

	}

}
