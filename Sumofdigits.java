package Recursion;

public class Sumofdigits {

	public static void main(String[] args) {
		Sumofdigits Object = new Sumofdigits();
		int n = 122;
		
		System.out.println(Object.sum(n));
		
		System.out.println(Object.prod(n));
	}
	public int sum(int n) {
		if(n<=1) {
			return 1;
		}
		
		return n%10+sum(n/10);
	}
	public int prod(int n) {
		
		if(n <= 1) {
			return 1;
		}
		return n%10 * prod(n/10); 
	}

}
