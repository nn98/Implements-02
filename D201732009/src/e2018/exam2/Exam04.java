package e2018.exam2;

import java.util.Arrays; 

public class Exam04 { 
	static Person[] clone(Person[] a) { 
		Person[] r=new Person[a.length];
		int i=0;
		for(Person p:a) {
			r[i]=p;
			i++;
		}
		return r;
	} 
	static boolean compareIdentity(Person[] a1, Person[] a2) {
		return a1.equals(a2);
	} 
	static boolean compareEquality(Person[] a1, Person[] a2) { 
		if(a1.getClass()==a2.getClass()) {
			if(a1.length==a2.length) {
				for(int i=0;i<a1.length;i++) {
					if(a1[i].age==a2[i].age) {
						if(a1[i].name==a2[i].name) {
							
						}else return false;
					}else return false;
				}
				return true;
			}else return false;
		}else return false;
	} 
	public static void main(String[] args) { 
		Person[] a1 = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) }; 
		Person[] a2 = clone(a1); System.out.println(compareIdentity(a1, a2)); 
		System.out.println(compareEquality(a1, a2)); 
	} 
}