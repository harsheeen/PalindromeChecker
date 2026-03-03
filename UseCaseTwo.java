package com.PalindromeChecker;
/** 
 * =========================================
 *MAIN CLASS- UseCaseOne - PalindromeChecker
 *===========================================
 *
 *UseCase 2 : APPLICATION 1 : Logic to check whether the hardcoded string is palindrome or not!
 *
 *Description:
 *----Hardcode the input string
 *---for loop to check whether the input string is palindrome or not
 *----If yes- print "Is it Palindrome-True!"
 *----If no- print "Is it Palindrome-False!"
 *
 *@author Harsheen Kaur
 *@version 2.0
 * */
public class UseCaseTwo {
	public static void main(String [] args) {
		//hardcoded string
		String input ="madam";
		
		//print the hardcoded string
		System.out.println("input string is "+ input);
		boolean is=true;

		//logic to check whether the string is palindrome
		//iterate through half  string and return false if the string at index i and len-i-1 does not match
		for(int i=0; i<input.length()/2; i++) {
			if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
				is=false;
				break;	
			}
			is=true;
		}

		System.out.println("Is it boolean "+ is);
	}
}
