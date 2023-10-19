public class Countwords {
	public static void main(String[] args) {
		String input = "   Hello,  World! This is a sample string.   ";
		int wordCount = countWords(input);
		System.out.println("Number of words in the string: " + wordCount);
	}

	public static int countWords(String input) {
		input = input.trim();

		if (input.isEmpty()) {
			return 0;
		}

		String[] words = input.split("\\s+");
		return words.length;
	}
}
