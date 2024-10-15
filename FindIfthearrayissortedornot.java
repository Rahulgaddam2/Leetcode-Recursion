package Recursion;

public class FindIfthearrayissortedornot {

	public static void main(String[] args) {
		FindIfthearrayissortedornot Object = new FindIfthearrayissortedornot();
		
		int[] array = {1,2,3,10,5,6};
		
		System.out.print(Object.sortedornot(array, 0));
		
	}
	public boolean sortedornot(int[] array , int index) {
		
		if(array[index] == array.length-1) {
			return true;
		}
		
		return array[index] < array[index+1] && sortedornot(array , index+1);
	}
}
