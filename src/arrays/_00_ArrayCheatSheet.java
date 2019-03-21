package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] string1 = { "boi1", "boi2", "boi3", "boi4", "boi5" };
		// 2. print the third element in the array
		System.out.println(string1[2]);
		// 3. set the third element to a different value
		string1[3] = "hi";
		// 4. print the third element again
		System.out.println(string1[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 1; i < 5; i++) {
			System.out.println(string1[i]);
		}
		// 6. make an array of 50 integers
		int[] inty = new int[50];
		// 7. use a for loop to make every value of the integer array a random number,
		for (int i = 1; i < inty.length; i++) {
			Random gen = new Random();
			inty[i] = gen.nextInt(20);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < inty.length; i++) {
			if (inty[i] < small) {
				small = inty[i];
			}
		}
		System.out.println("smallest "+small);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < inty.length; i++) {
			System.out.println(inty[i]);
		}
		int big = Integer.MAX_VALUE;
		for (int i = 0; i < inty.length; i++) {
			if(inty[i] > big) {
				big = inty[i];
			}
		}
		System.out.println("biggest "+ big);
		// 10. print the largest number in the array.
	}
	
}
