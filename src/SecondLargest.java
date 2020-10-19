import acm.program.*;

public class SecondLargest extends ConsoleProgram {

	private static final int SENTINEL = 0;

	public void run() {
		System.out.println("This program finds the two largest integers in a ");
		System.out.println("list. Enter values, one per line, using a 0 to");
		System.out.println("signal the end of the list.");

		int largest = 0;
		int secondLargest = 0;

		while (true) {
			int num = readInt(" ? ");
			if (num == SENTINEL)
				break;
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest) {
				secondLargest = num;
			}

		}

		System.out.println("The largest value is " + largest);
		System.out.println("The second largest is " + secondLargest);

	}

}
