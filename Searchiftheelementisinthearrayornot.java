package Recursion;

import java.util.*;

public class Searchiftheelementisinthearrayornot {

	public static void main(String[] args) {
		Searchiftheelementisinthearrayornot Object = new Searchiftheelementisinthearrayornot();
		
		int[] array = {1,2,3,4,5};
		int target = 1;
		
		int[] array1 = {1,1,1,2,3,4,5,1,1,23,1};
		int target1 = 1;
		
		System.out.println(Object.element(array, target, 0));
		System.out.println(Object.alltheindex(array1, target1, 0, new ArrayList<>()));

	}
	public boolean element(int[] array , int target , int index) {
		
		if(index == array.length) {
			return false;
		}
		
		if(target == array[index]) {
			return true;
		}
		
		
		
		
		return element(array , target , index+1);
	}
	public ArrayList<Integer> alltheindex(int[] array1 , int target1 , int index , ArrayList<Integer> list) {
		if(index == array1.length) {
			return list;
		}
		
		if(array1[index] == target1) {
			list.add(index);
		}
		return alltheindex(array1,target1,index+1,list);
	}

}
