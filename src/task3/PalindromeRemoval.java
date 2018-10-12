package task3;

import java.util.Scanner;

public class PalindromeRemoval {
	public static void main(String[] args) {
		String s1;
		String[] s2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		s1 = s.nextLine();
		s2 = s1.split(" ");
		String[] s3 = new String[s2.length];
		s3 = s2.clone();
		for (int i = 0; i < s3.length; i++) {
			if (!palidromeString(s3[i])) {
				System.out.print(s3[i] + " ");
			}
		}
		s.close();
	}

	private static boolean palidromeString(String string) {
		// TODO Auto-generated method stub

		String s = "";
		char[] c = string.toCharArray();
		char[] rev = new char[c.length];
		int len = c.length;
		if (len == 1) {
			//System.out.print(string.length());
			return false;
		} else {
			for (int i = 0; i < c.length; i++) {
				rev[i] = c[len - 1];
				len--;
			}
		}
		s = String.valueOf(rev);
		if (s.equals(string)) {
			return true;
		} else
			return false;
	}
}
