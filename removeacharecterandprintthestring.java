package Recursion;

public class removeacharecterandprintthestring {

	public static void main(String[] args) {
		removeacharecterandprintthestring Object = new removeacharecterandprintthestring();
		
		String p = "";
		String up = "aaabbaccad";
		char charecter = 'a';
		
		Object.skip(p, up, charecter);

	}
	public void skip(String p , String up , char charecter) { // p = processed , up = unprocessed
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch == charecter) {
			 skip(p, up.substring(1) , charecter);
		}else {
			skip(p + ch , up.substring(1) , charecter);
		}
	}

}
