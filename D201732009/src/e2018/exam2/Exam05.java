package e2018.exam2;

import java.util.ArrayList; 

import java.util.Collection; 

import java.util.Iterator; 
public class Exam05 { 
	static void removeEvenNumbers(Collection<Integer> c) {
		for(int i=0;i<10;i++) {
			if(i%2==0) c.remove(i);
		}
	} 
	public static void main(String[] args) { 
		Collection<Integer> c = new ArrayList<Integer>(); 
		for (int i = 0; i < 10; ++i) 
			c.add(i); 
		removeEvenNumbers(c); 
		System.out.println(c.toString()); 
	} 
}