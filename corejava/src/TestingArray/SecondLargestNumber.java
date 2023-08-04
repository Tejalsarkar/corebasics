 package TestingArray;

public class SecondLargestNumber {
	public static void main(String[] args) {

		int[] arr = { 700, 500, 1500, 400, 70, 21 };
		int a = 0;
		int b = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > b) {
				a = b;
				b = arr[i];
			}

			if (arr[i] > a && arr[i] < b) {
				a = arr[i];
			}

		}
		System.out.println("SecondLargestnumber" + a);
	}
}