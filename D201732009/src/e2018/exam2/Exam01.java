package e2018.exam2;

public class Exam01 {

	public static double average(int... a) { 
		double result;
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		result=(double)sum/(double)a.length;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 3, 4, 5 }; 
		System.out.println(average(2, 3)); 
		System.out.println(average(2, 3, 4)); 
		System.out.println(average(a));
	}

}
