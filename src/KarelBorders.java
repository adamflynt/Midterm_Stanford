import stanford.karel.*;

public class KarelBorders extends SuperKarel {

	/*
	 * Moves Karel one space inside from the border and will execute drawBorder four
	 * times to complete the border of beepers.
	 */
	public void run() {
		move();
		turnLeft();
		for (int i = 0; i < 4; i++) {
			drawBorder();
		}

	}

	/*
	 * Karel will move and place beepers until it reaches the wall Karel will then
	 * turn around, move back one space from the wall and turn to continue placing
	 * the border beepers.
	 */
	private void drawBorder() {
		move();
		turnRight();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
		turnAround();
	}
}
