package task2;

public class ArraySum {
	public static void main(String[] args) {
		int[] a = { 2, 2, 0, 4, 8, 2 }, b[];
		int sum = 0, len = a.length, i, j, temp;
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					sum = a[i] + a[j];
					a[i] = sum;
					a[j] = 0;
				}

			}
		}j=0;
		for (i = 0; i < len; i++) {
			if (a[i] != 0) {
				a[j++] = a[i];
			}
		}
		for (i = 0; i < len; i++) {
			if (a[i] == 0) {
				a[j++] = a[i];
			}
		}
		for (i = 0; i < len-1; i++) {
			System.out.print(a[i] + " ");
		}
	}
}