package Recursion;

import java.util.ArrayList;

public class Subseq {

	public static void main(String[] args) {
		Subseq Object = new Subseq();
		
		String p ="";
		String up = "abc";
		
		Object.sub(p, up);
		
		

	}
	public void sub(String p , String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		sub(p + ch , up.substring(1) );
		
		sub(p, up.substring(1));
	}

}
