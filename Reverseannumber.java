package Recursion;

public class Reverseannumber {

	public static void main(String[] args) {
		Reverseannumber Object = new Reverseannumber();
		
		int n = 2345;
		
		System.out.println(Object.reverse(n));
		
	}
	public int reverse(int n) {
		int digits = (int)(Math.log10(n)) +1;
		return helper(n, digits);
	}
	public int helper(int n , int digits) {
		if(n%10 == n) {
			return n;
		}
		int rem = n%10;
		return rem* (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
	}

}
