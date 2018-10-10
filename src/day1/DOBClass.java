package day1;

public class DOBClass {
	public static void main(String[] sample) {
		String dob = sample[0];
		String d = dob.replaceAll("-", " ");
		System.out.println(d);
		char c[] = d.toCharArray();
	}
}
