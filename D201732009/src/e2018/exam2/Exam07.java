package e2018.exam2;

import java.util.ArrayList; 

import java.util.Arrays; 

import java.util.Collection; 

public class Exam07 { 
	static Collection<String> intersection(Collection<String> c1, Collection<String> c2) { 
		Collection<String> c3 = new ArrayList<String>();
		Collection<String> c4 = new ArrayList<String>();
		c3.addAll(c1);
		c4.addAll(c1);
		c3.retainAll(c2);
		c4.removeAll(c3);
		c3.removeAll(c4);
		return c3;
	} 
	public static void main(String[] args) { 
		Collection<String>
		c1 = Arrays.asList("a", "b", "c", "d"); 
		Collection<String> c2 = Arrays.asList("b", "d", "e", "f"); 
		Collection<String> c3 = intersection(c1, c2); 
		System.out.println(c1.toString()); 
		System.out.println(c2.toString()); 
		System.out.println(c3.toString()); 
	} 
}