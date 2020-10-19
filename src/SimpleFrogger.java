import acm.graphics.*;
import acm.program.*;
import java.awt.event.MouseEvent;

public class SimpleFrogger extends GraphicsProgram {

	private static final int SQSIZE = 75;
	private static final int NCOLS = 7;
	private static final int NROWS = 3;
	public static final int APPLICATION_WIDTH = NCOLS * SQSIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQSIZE;
	private GImage frog;
	private double fx;
	private double fy;

	public void run() {
		frog = new GImage("frog.png");

		double scaleX = SQSIZE / frog.getWidth();
		double scaleY = SQSIZE / frog.getHeight();
		frog.scale(scaleX, scaleY);

		double fx = (NCOLS / 2 + 0.5) * SQSIZE;
		double fy = (NROWS - 0.5) * SQSIZE;
		add(frog, fx - frog.getWidth() / 2, fy - frog.getHeight() / 2);

		addMouseListeners();

	}

	public void mouseClicked(MouseEvent e) {
		double mx = e.getX();
		double my = e.getY();
		if (Math.abs(mx - fx) > Math.abs(my - fy)) {
			if (mx > fx) {
				moveFrog(SQSIZE, 0);
			} else {
				moveFrog(-SQSIZE, 0);
			}

		} else {
			if (my > fy) {
				moveFrog(0, SQSIZE);
			} else {
				moveFrog(0, -SQSIZE);
			}
		}
	}

	private void moveFrog(double gx, double gy) {
		if (froggerWorld(fx + gx, fx + gx)) {
			fx += gx;
			fy += gy;
			frog.move(gx, gy);
		}
	}

	private boolean froggerWorld(double x, double y) {
		return (x >= 0 && x <= NCOLS * SQSIZE && y >= 0 && y <= NROWS * SQSIZE);
	}

}
