package Recursion;

public class LeetCode1342 {

	public static void main(String[] args) {
		LeetCode1342 Object = new LeetCode1342();
		
		int n = 6722;
		
		System.out.println(Object.Numberofstepstoreduceanumbertozzero(n));

	}
	
	public int Numberofstepstoreduceanumbertozzero(int n) {
		return helper(n,0);
	}
	public int helper(int n , int steps) {
		if(n==0) {
			return steps;
		}
		
		if(n%2 == 0) {
			return helper(n/2,steps+1);
		}else {
			return helper(n-1,steps+1);
		}
		
	}

}
