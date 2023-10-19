public class Main {
	public static void main(String[] args) {
		String[] array1 = { "apple", "orange", "banana", "apple", "grapes", "orange" };
		String[] array2 = { "red", "green", "blue", "yellow", "green", "purple" };

		findDuplicates(array1);
		findDuplicates(array2);
	}

	public static void findDuplicates(String[] array) {
		System.out.println("Duplicate values in the array:");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					System.out.println(array[i]);
					break;
				}
			}
		}
	}
}
