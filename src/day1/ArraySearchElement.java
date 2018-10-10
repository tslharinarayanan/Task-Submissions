package day1;

public class ArraySearchElement {
	public static void main(String[] args) {
		int[] a={6,3,9,8,10,2,1,5,7};int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[j]<a[i]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
