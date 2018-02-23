package SimonPartner;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import SimonJiaMing.ButtonInterfaceJiaMing;
import gui.components.Action;
import gui.components.Component;

public class Button extends Component implements ButtonInterfaceJiaMing {

	private Color tempC;
	private Color c;
	private static int width = 50;
	private static int height = 50; 
	Action action;
	
	public Button() {
		super(0, 0, width, height);
		tempC = Color.lightGray;
		update();
	}

	@Override
	public void act() {
		action.act();
	}

	@Override
	public boolean isHovered(int x, int y) {
		int xx;
		return x>getX() && x<getX()+getWidth() && y > getY() && y<getY()+getHeight();
	}
	
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public boolean isAnimate() {
		return false;
	}
	
	@Override
	public void setColor(Color color) {
		c = color;
		update();
	}
	
	public Color getColor() {
		return tempC;
	}
	
	@Override
	public void setAction(Action a) {
		action = a;
	}

	@Override
	public void highlight() {
		tempC = c;
		update();
	}

	@Override
	public void dim() {
		tempC = Color.lightGray;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(tempC != null) {
			g.setColor(tempC);
			g.fillOval(0, 0, width, height);
			g.setColor(Color.BLACK);
			g.drawOval(0, 0, width-1, height-1);

		}
	}

}
