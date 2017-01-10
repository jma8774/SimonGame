package SimonJiaMing;

import java.awt.Color;

import gui.components.Action;
import gui.components.Clickable;

public interface ButtonInterfaceJiaMing extends Clickable{

	void setColor(Color color);

	void setX(int i);

	void setY(int i);
	
	void setAction(Action a);

	void highlight();

	void dim();
}
