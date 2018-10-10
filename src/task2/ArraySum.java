package task2;

public class ArraySum {
	public static void main(String[] args) {
		int[] a = { 2, 2, 0, 4, 0, 8 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						sum = a[i] + a[j];
						a[0] = sum;
						a[j] = 0;
					}
				}
		}
		System.out.print("Output: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
