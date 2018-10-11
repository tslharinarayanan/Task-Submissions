package task2;

public class ArrayElement {
	public static void main(String[] args) {
		int[] a = { 6, 3, 9, 8, 10, 2, 1, 15, 7 }, b = { 6, 3, 9, 8, 10, 2, 1, 15, 7 };
		int i, j, k = 0, len = a.length, a1 = 0, ds = 20;
		System.out.print("output ");
		for (i = 0; i < len; i++) {
			ds = 20;
			a1 = 0;
			for (j = 0; j < len; j++) {
				if (i != j) {
					if (a[i] < b[j]) {
						a1 = b[j] - a[i];
						if (a1 < ds) {
							ds = a1;
							k = j;

						}

					}
				}
			}
			if (a1 == 0) {
				a[i]=0;
			} else {
				a[i] = b[k];
			}
		}
		for (i = 0; i < len; i++)
			System.out.print(a[i] + " ");
	}
}
