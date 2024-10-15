package Recursion;

public class Countanynumber {

	public static void main(String[] args) {
		Countanynumber Object = new Countanynumber();
		
		int n= 12050303;
		
		int count=0;
		
		System.out.println(Object.count(n));

	}
	public int count(int n) {
		return helper(n,0);
	}
	public int helper(int n , int c) {
		if(n==0) {
			return c;
		}
		
		int rem = n%10;
		if(rem == 0) {
			return helper(n/10,c+1);
		}
		return helper(n/10, c);
	}

}
