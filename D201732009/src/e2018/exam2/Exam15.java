package e2018.exam2;

import java.util.Arrays; 

public class Exam15 { 
	static void sort(int[] a) { 
		Arrays.sort(a);
	} 
	static int[] insert(int[] a, int value) { 
		int[] b;
		if(Arrays.binarySearch(a, value)>=0) {
			b=a;
		}
		else if(Arrays.binarySearch(a, value)<0) {
			b=new int[a.length+1];
			int i=0;
			for(;i<-Arrays.binarySearch(a, value);i++) {
				b[i]=a[i];
			}
			b[-Arrays.binarySearch(a, value)-1]=value;
			for(;i<b.length;i++) {
				b[i]=a[i-1];
			}
		}
		else {
			b=a;
		}
		return b;
	} 
	public static void main(String[] args) { 
		int[] a = { 3, 8, 1, 2, 4, 5, 7 }; 
		sort(a); 
		System.out.println(Arrays.toString(a)); 
		a = insert(a, 2);
		a = insert(a, 6); 
		System.out.println(Arrays.toString(a)); 
	}
}