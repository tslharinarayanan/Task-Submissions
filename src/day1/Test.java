package day1;

import java.util.Scanner;

public class Test {
	static int abc=250;
	int sum(int... numbers) {
		System.out.println(numbers);
		int a[] = numbers, i = 0, sum = 0;
		for (System.out.println("for loop " + i); i < a.length; i++)
			sum += a[i];
		for (i = 0; i > a.length; System.out.println("smaple"))
			System.out.println(i);
		System.out.println();
		return sum;
	}
	void printInt(int[]... x){
		System.out.println("inside of the printInt method "+x);
		for(int[] xyz:x)
			System.out.println(xyz.toString());
	}

	public static void main(String... args) {
		byte b = 50;
		int[] ary1 = new int['A'];
		int[] ary2 = new int[83636];
		b *= 1000000;
		int x = 0x10;
		float a = 123.333f;
		double d = 123.09876, c = 0xbEeF;
		System.out.println(b);
		System.out.println(126 > 3);
		Test t = new Test();
		System.out.println(t.sum(10, 20, 30, 50, 90, 1000, 1200, 400, 600, 800, 800) + " " + x + " " + a + " " + d + " "
				+ c + " array" + ary1.length + " array2 " + ary2);

		int[][][][] ary3 = new int[2][2][2][2];
		Scanner s = new Scanner(System.in);
		/*
		 * for(int i=0;i<2;i++) for(int j=0;j<2;j++) for(int k=0;k<2;k++)
		 * for(int l=0;l<2;l++) ary3[i][j][k][l]=s.nextInt();
		 */
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						System.out.print(ary3[i][j][k][l]);
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		float a1[]={3,2,1};
		float b1[]=fix(a1);
		System.out.println(a1[0]+a1[1]+a1[2]+" "+b1[0]+b1[1]+b1[2]);
		String[] array={"A","B"};
		for(int i=0;i<args.length;i++)
			System.out.print(args[i]);
		args=array;
		System.out.println(args.length);
		for(int i=0;i<args.length;i++)
			System.out.print(args[i]);
		System.out.println("\n"+abc);
		abc=123456789;System.out.println(abc);
		int str[]=null;
		System.out.println(str);
		int var1[]={40,50,60,70,80,900,100};
		int var2[]={10,20,30};
		t.printInt(var1,var2);
		}

	private static float[] fix(float[] x) {
		// TODO Auto-generated method stub
		x[1]=10;
		return x;
	}
	
	}

