package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternPrint {
	public static void main(String[] args) throws IOException {
		String str = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		str = br.readLine();
		char[] s = str.toCharArray();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s[j] + " ");
			}
			System.out.println();
		}
		for (int i = len - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(s[j] + " ");
			}
			System.out.println();
		}
	}
}
