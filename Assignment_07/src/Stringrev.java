public class Stringrev {
	public static void main(String[] args) {
		String input = "Hello, World!";
		String reversedString = reverseUsingStringBuilder(input);
		System.out.println("Reversed String: " + reversedString);
	}

	public static String reverseUsingStringBuilder(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);
		return stringBuilder.reverse().toString();
	}
}
