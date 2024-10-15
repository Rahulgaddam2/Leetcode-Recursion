package Recursion;

public class Factorialofanumber {

	public static void main(String[] args) {
		Factorialofanumber Object = new Factorialofanumber();
		
		int n=5;
		
		System.out.println(Object.factorial(n));
		
	}
	public int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		
		return n *factorial(n-1);
	}

}
