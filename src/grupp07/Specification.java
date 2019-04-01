package grupp07;

import robocode.Robot;

public interface Specification {

	/*Agerar på meddelanden som tas emot*/
	void onMessageRecieved(robocode.MessageEvent e);
	
	void shoot(int x, int y);
	
	void shoot(int grader);
	
	void changeColor();
	
	void moveToCenter();
	
	void onHit();
	
	
	
	
}
