package day1;

public class Javaj2eeDisplayFormat {
	public static void main(String[] args) {


		String s = "JAVAJ2EE";
		int i, j, len = s.length();
		char c[] = s.toCharArray();
		for (i = 0; i < len; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
		for (i = len; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}
}
