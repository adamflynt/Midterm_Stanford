import acm.program.*;

public class RemoveDoubledLetters extends ConsoleProgram {
	public void run() {
		while (true) {
			String str = readLine("Enter a phrase: ");
			System.out.println("" + removeDoubledLetters(str));
		}
	}

	private String removeDoubledLetters(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 || ch != str.charAt(i - 1)) {
				result += ch;
			}
		}

		return result;
	}

}
