package Recursion;

public class Fibonaccisequence {

	public static void main(String[] args) {
		
		// Fibonaccisequence is adding of previous 2 numbers
		
		Fibonaccisequence Object = new Fibonaccisequence();
		System.out.println(Object.Fibonacci(72));
	}
	public int Fibonacci(int n) {
		
		if(n<=1) {
			return n;
		}
		
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}

}
