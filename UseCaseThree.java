package com.PalindromeChecker;
/** 
 * =========================================
 *MAIN CLASS- UseCaseOne - PalindromeChecker
 *===========================================
 *
 *UseCase 3 : APPLICATION : Reverse the string and compare the input with reversed one
 *
 *Description:
 *----Hardcoded the input string
 *---Reverse the string and compare the input with reversed one
 *----If yes- print "Is it Palindrome-True!"
 *----If no- print "Is it Palindrome-False!"
 *
 *@author Harsheen Kaur
 *@version 2.0
 * */
public class UseCaseThree {
	public static void main(String [] args) {
		//hardcoded string
		String input ="madam";
		
		//print the hardcoded string
		System.out.println("input string is "+ input);
		boolean is=true;
		StringBuffer Input_reverse = new StringBuffer();

		//logic to reverse the input string
		for(int i=input.length()-1; i>=0; i--) {
			Input_reverse.append(input.charAt(i));
				
		}
		
		//compare reverse string with input string
		boolean isPalindrome=input.equals(Input_reverse.toString());

		System.out.println("Is it boolean "+ isPalindrome);
	}
}
