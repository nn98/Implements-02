package e2018.exam2;

import java.util.Arrays; 

public class Exam02 { 
	static String toString(Person[] a) {
		String r="[";
		String[] t=new String[a.length];
		for(int i=0;i<a.length;i++) {
			t[i]=a[i].toString();
		}
		r+=t[0];
		for(int i=1;i<t.length;i++) {
			r+=" , "+t[i];
		}
		r+="]";
		return r;
		/*String result="[";
		String[] r=new String[a.length];
		for(int c=0;c<a.length;c++) {
			r[c]=new String("");
			r[c]+="{\"";
			r[c]+=a[c].name;
			r[c]+="\" , ";
			r[c]+=Integer.toString(a[c].age);
			r[c]+="}";
		}
		result+=r[0];
		for(int c=1;c<a.length;c++) {
			result+=" , "+r[c];
		}
		result+="]";
		return result;
		*/
	} 
	public static void main(String[] args) { 
		Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) };

		System.out.println(toString(a)); 
	} 
}