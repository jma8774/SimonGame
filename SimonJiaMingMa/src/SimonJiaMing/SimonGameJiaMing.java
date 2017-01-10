package SimonJiaMing;

import gui.GUIApplication;

public class SimonGameJiaMing extends GUIApplication {

	public SimonGameJiaMing(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		SimonScreenJiaMing ss = new SimonScreenJiaMing(getWidth(), getHeight());
		setScreen(ss);
		}
	
	public static void main(String[] args) {
		SimonGameJiaMing sg = new SimonGameJiaMing(1280,1024);
		Thread game = new Thread(sg);
		game.start();
	}
}
