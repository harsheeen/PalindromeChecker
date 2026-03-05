package com.PalindromeChecker;
import java.util.*;
/** 
 * =========================================
 *MAIN CLASS- UseCaseNine - PalindromeChecker
 *===========================================
 *
 *UseCase 9 : APPLICATION : Palindrome checker using Recursion
 *
 *Description:
 *----Hard code the input string
 *----Create a recursive function called isPalindrome
 *----Initialize two pointer start and end
 *----Start points to the first character of the string
 *----End points to the last character
 *---recursively call the isPalindrome with args(string,start,end)
 *---base conditions - if(string.charAt(start)!=string.charAt(end), return false
 *			         - if(start>=end), return true

 *@author Harsheen Kaur
 *@version 9.0
 * */
public class UseCaseNine {
	//recursive function 
	static boolean isPalindrome(String str, int start, int end) {
		//base condition
		if(start>=end)
			return true;

		//return false if start char doesn't match end char
		if(str.charAt(start)!=str.charAt(end))
			return false;

		return isPalindrome(str,start+1,end-1);
	}

	public static void main(String args[]) {
		//hard code input string
		String str="madam";

		//two pointers - start referring to first char and end referring to last char
		int start=0;
		int end=str.length()-1;

		boolean value = isPalindrome(str,start,end);
		System.out.println("The input string is : " + str);

		System.out.print("Is it palindrome : " + value);

	}
}
