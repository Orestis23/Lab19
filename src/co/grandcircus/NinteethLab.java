package co.grandcircus;

public class NinteethLab {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };

		System.out.println(countOccurrences(arr1));

	}

	public static int countOccurrences(int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr2.length; i++) {
			int currentInt = arr2[i];

			if (currentInt == arr2[i]) {
				count++;
			}

		}
		return count;

	}

}
