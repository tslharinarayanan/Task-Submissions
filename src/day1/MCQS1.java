package day1;

public class MCQS1 {
	public static void main(String[] args) {
		String[] s = { "a", "b", "c", "a", "c" };
		for (int i = 0; i < s.length; ++i) {
			for (int j = i + 1; j < s.length; ++j) {
				if (s[i].compareTo(s[j]) == 0)
					System.out.println(s[j]);
			}
		}
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "HELLO";
		System.out.println(s1.equals(s2) + " " + s2.equals(s3));
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" World!");
		System.out.println(sb);
		int x = 10;
		System.out.println(x);
	}
	/*static{ 
	 	System.out.println(x); 
	 }*/
	static {
		int x = 20;
		System.out.println(" " + x);
	}

}
