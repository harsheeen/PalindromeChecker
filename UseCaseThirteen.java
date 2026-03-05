package com.PalindromeChecker;
/** 
 * =========================================
 *MAIN CLASS - UseCaseThirteen - PalindromeChecker
 *===========================================
 *
 *UseCase 13 : APPLICATION : Performance Comparison
 *
 *Description:
 *---- Displaying the time of execution in milliseconds for three different approaches
 *--- Approach 1 : Stack Based Approach - UC 12
 *--- Approach 2 : Two Pointer Approach - UC 9
 *--- Approach 3 : Stack and Queue Approach - UC 6
 *---
 *--- TIME OF EXECUTION -> STACK > STACK AND QUEUE > TWO POINTER
 *
 *---nanoTime() - returns the current value of the most precise available system timer, in nanoseconds. 

 *@author Harsheen Kaur
 *@version 13.0
 * */
public class UseCaseThirteen {
	public static void main(String [] args) {
		double start,end;
		String input="level";
		
		//stack approach
		start=System.nanoTime();
		boolean isPalindrome=new Stack_Palindrome().isPalindrome(input);
		end=System.nanoTime();
		System.out.print("Stack approach : ");
		System.out.println((end-start)/1000000);

		//two pointers
		start=System.nanoTime();
		isPalindrome=UseCaseNine.isPalindrome(input, 0, input.length()-1);
		end=System.nanoTime();
		System.out.print("Two Pointer : ");
		System.out.println((end-start)/1000000);
		
		//Stack and Queue implementation
		start=System.nanoTime();
		isPalindrome=UseCaseSix.isPalindrome(input);
		end=System.nanoTime();
		System.out.print("Stack and Queue : ");
		System.out.println((end-start)/1000000);
		
		



	}
}
