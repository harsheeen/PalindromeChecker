package com.PalindromeChecker;
import java.util.*;
/** 
 * =========================================
 *MAIN CLASS- UseCaseSeven - PalindromeChecker
 *===========================================
 *
 *UseCase 8 : APPLICATION : Palindrome checker using LinkedList
 *
 *Description:
 *----Hard code the input string
 *----Initialize a LinkedList using collection interface
 *----Convert the string to charArray and add it to LinkedList 
 *----Simultaneously compare the elements removeFirst and removeLast
 *----If the elements are equal, continue the iteration till the elements left are less than 1 
 *----Else, return false
 *----If yes - print "Is it Palindrome-True!"
 *----If no - print "Is it Palindrome-False!"
 *
 *@author Harsheen Kaur
 *@version 8.0
 * */
public class UseCaseEight {
	public static void main(String args[]) {

		//Using collection framework for LinkedList
		LinkedList<Character> list=new LinkedList<Character>();

		//Hard code the input string
		String input="level";
		System.out.println("The input string is : " + input);

		//boolean variable to consider isPalindrome be true or false
		boolean isPalindrome=true;

		//add elements to list
		for (char c:input.toCharArray())
			list.add(c);
		
		//compare first and last element of the list 
		while(list.size()>1) {
			if(list.removeFirst()!=list.removeLast()) {
				isPalindrome=false;
				break;
			}
		}
		System.out.print("Is it palindrome : " + isPalindrome);

	}
}
