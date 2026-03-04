package com.PalindromeChecker;
import java.util.*;
/** 
 * =========================================
 *MAIN CLASS- UseCaseFive - PalindromeChecker
 *===========================================
 *
 *UseCase 5 : APPLICATION : Palindrome checker using stack
 *
 *Description:
 *----Hardcode the input string
 *----Convert the string to charArray and push it to stack
 *---- compare the input string to elements Poping and return true if they always match
 *----If yes- print "Is it Palindrome-True!"
 *----If no- print "Is it Palindrome-False!"
 *
 *@author Harsheen Kaur
 *@version 5.0
 * */
public class UseCaseFive {

	public static void main(String [] args) {
		
		Stack<Character> stack=new Stack<Character>();
		String input="madam";
		char [] array=input.toCharArray();
		
		for(int i=0;i<array.length;i++) {
			stack.push(array[i]);
		}
		boolean isPalindrome=true;
		for(int i=0;i<array.length;i++) {
			if(stack.pop()!=array[i]) {
				isPalindrome=false;
			}
		}
		System.out.println("the input string is "+input);
		System.out.println("Is it boolean: "+ isPalindrome);
		

	}
}
