package com.PalindromeChecker;
import java.util.*;
/** 
 * =========================================
 *MAIN CLASS- UseCaseTen - PalindromeChecker
 *===========================================
 *
 *UseCase 10 : Normalized Palindrome Validation
 *Description:
 *----Hard code the input string
 *----Normalized the input string by removing whitespace and converting all chars to lower case

 *----for loop to check whether the normalized string is palindrome or not
 *----If yes- print "Is it Palindrome-True!"
 *----If no- print "Is it Palindrome-False!"

 *@author Harsheen Kaur
 *@version 10.0
 * */
public class UseCaseTen {
	public static void main(String args []) {
		
		//Hard code input string
		String input = "A man a plan A cannal Panama";
		System.out.println("Input String is : "+ input);
		
		//Remove whitespaces form string
		String normalised_input=input.replaceAll("\\S+","");

		//Convert the string characters to lowercase
		normalised_input=normalised_input.toLowerCase();

		
		boolean isPalindrome=true;

		//logic to check whether the string is palindrome
		//iterate through half  string and return false if the string at index i and len-i-1 does not match
		for(int i=0; i<normalised_input.length()/2; i++) {
			if(normalised_input.charAt(i)!=normalised_input.charAt(normalised_input.length()-i-1)) {
				isPalindrome=false;
				break;	
			}
		}

		System.out.println("Is it boolean : "+ isPalindrome);
	}
}
