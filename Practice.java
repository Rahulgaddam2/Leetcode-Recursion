package Recursion;

public class Practice {

	public static void main(String[] args) {
		
		print(2);
			
	}
	public static void print(int n) {
		
		if(n == 10) {
			System.out.println(10);
			return;
		}
		
		System.out.println(n);
		print(n+1);
	}
	
	

}
