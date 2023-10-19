public class Palindrome {
	public static void main(String[] args) {
		String input = "madam";
		boolean isPalindrome = input.replaceAll("\\s", "")
				.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
		System.out.println(input + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
	}
}
