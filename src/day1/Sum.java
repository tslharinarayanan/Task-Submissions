package day1;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		String[] arg = args;
		int sum = 0;
		for (String ele : arg) {
			int element = Integer.parseInt(ele);
			sum += element;
		}
		int Runnable=10;
		System.out.println(Runnable);
		System.out.println(sum);

		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		sum = 0;
		sum = (a.length * a.length + 1) / 2;
		System.out.println(sum);
		System.out.println(sum(a));
		s.close();
	}
	static int sum(int x[]){
		int s=0;
		for(int i=0;i<x.length;i++)
			s+=x[i];
		return s;
	}
}
