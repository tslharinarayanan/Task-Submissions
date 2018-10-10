package day1;

public class Patterns {
	public static void main(String[] args) {
		int i = 0, j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; ++j) {
				System.out.print(" " + j);
			}
			System.out.println();
		}

		for (i = 1; i <= 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
