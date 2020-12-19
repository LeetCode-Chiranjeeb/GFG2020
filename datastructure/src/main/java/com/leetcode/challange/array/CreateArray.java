/**
 * 
 */
package com.leetcode.challange.array;

/**
 * @author 91735
 *
 */
public class CreateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeOneDimentionlalArray();
		initializeTwoDimentionlalArray();
	}	
	
	public static void initializeOneDimentionlalArray() {
		// Need to initialize array on the time of creation because jvm need to allocate 
		//Continuous memory for the array.
		
		//[10,11,12]
		int [] numbers = new int[10]; // Declaration 
		numbers[0] = 10;
		numbers[1] = 11;
		numbers[2] = 12;
		
		//Ans 10
		System.out.println(numbers[0]);
		
		//[3]
		char chars[] = new char[3];
		chars[0] = 'H';
		
		//Ans H
		System.out.println(chars[0]);
		
		//[10.5,10.6,11]
		float [] salaries = {10.5f,10.6f,11.0f}; //Declaration with initialization in one line 
		
		//Ans 10.f
		System.out.println(salaries[0]);
	}
	
	public static void initializeTwoDimentionlalArray() {
		// Need to initialize array on the time of creation because jvm need to allocate 
		//Continuous memory for the array.
		int [][] numbers = new int[2][2];
		//[11,12]
		//[21,22]
		numbers [0][0] = 11;
		numbers [0][1] = 12;
		
		numbers [1][0] = 21;
		numbers [1][1] = 22;
		
		//answer 12
		System.out.println(numbers[0][1]);
		
		//[a,b]
		//[c,d]
		char[][] chars = {{'a','b'},{'c','d'}};
		
		//answer b
		System.out.println(chars[0][1]);
	}

}
