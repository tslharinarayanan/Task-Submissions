package day1;

import java.util.Scanner;

public class ComparingTwoNumbers {
	public static void main(String[] args) {

		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a = s.nextInt();
		b = s.nextInt();
		if (a >= (b + 2)) {
			System.out.println("A is bigger than B");
		} else if (b > (a + 2)) {
			System.out.println("B is bigger than A");
		} else {
			System.out.println("INCONCLUSIVE");
		}
	}
}
