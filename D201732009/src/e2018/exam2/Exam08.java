package e2018.exam2;

import java.util.ArrayList; 

import java.util.Arrays; 

import java.util.Collection; 

public class Exam08 { 
	static Collection<String> intersection(Collection<String> c1, Collection<String> c2) {
		Collection<String> result =  new ArrayList<String>(); 
		Collection<String> r =  new ArrayList<String>(); 
		for(String s1:c1) {
			r.add(s1);
		}
		for(String s1:c2) {
			if(r.contains(s1)) {
				r.remove(s1);
			}
		}
		result.addAll(c1);
		result.removeAll(r);
		return result;
	} 
	public static void main(String[] args) { 
		Collection<String> c1 = Arrays.asList("a", "b", "c", "d"); 
		Collection<String> c2 = Arrays.asList("b", "d", "e", "f"); 
		Collection<String> c3 = intersection(c1, c2); 
		System.out.println(c1.toString());
		System.out.println(c2.toString()); 
		System.out.println(c3.toString()); 
	} 
}