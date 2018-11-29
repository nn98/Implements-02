package e2018.exam2;

import java.util.ArrayList; 

import java.util.Arrays;

import java.util.Collection; 

public class Exam06 { 
	static void intersection(Collection<String> c1, Collection<String> c2) {
		Collection<String> c3 = new ArrayList<String>();
		Collection<String> c4 = new ArrayList<String>();
		c3.addAll(c1);
		c4.addAll(c1);
		c3.retainAll(c2);
		c4.removeAll(c3);
		c1.removeAll(c4);
	} 
	public static void main(String[] args) { 
		Collection<String> c1 = new ArrayList<String>(); 
		Collection<String> c2 = new ArrayList<String>(); 
		c1.addAll(Arrays.asList("a", "b", "c", "d")); 
		c2.addAll(Arrays.asList("b", "d", "e", "f")); 
		intersection(c1, c2); 
		System.out.println(c1.toString()); 
	} 
}