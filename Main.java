public class Main {
	public static void main(String[] args) {
		String input =  "  I   love   java   programming  ";
		input = input.trim().replaceAll("\\s+", " ");

		String[] words = input.split(" ");

		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			if (i == words.length - 1) {
				reversed.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1));
			} else {
				reversed.append(words[i].toLowerCase());
			}

			if (i > 0) {
				reversed.append(" ");
			}
		}
		System.out.println(reversed.toString());
	}
}