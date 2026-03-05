package com.PalindromeChecker;

import java.util.*;

/** 
 * =========================================
 *MAIN CLASS- UseCaseSeven - PalindromeChecker
 *===========================================
 *
 *UseCase 7 : APPLICATION : Palindrome checker using dequeue
 *
 *Description:
 *----Hard code the input string
 *----Initialize a dequeue using collection interface
 *----Convert the string to charArray and push it to dequeue
 *----Simultaneously compare the elements removeFirst and removeLast
 *----If the elements are equal, continue the iteration till the elements left are less than 1 
 *----Else, return false
 *----If yes - print "Is it Palindrome-True!"
 *----If no - print "Is it Palindrome-False!"
 *
 *@author Harsheen Kaur
 *@version 7.0
 * */
public class UseCaseSeven {
	public static void main(String args[]) {


		//Using collections for deque
		Deque<Character> deque=new LinkedList<Character>();
		//Hard code the input string
		String input="madam";
		System.out.println("The input string is : " + input);

		//boolean variable to consider isPalindrome be true or false
		boolean isPalindrome=true;

		//convert array to charArray
		char[] array=input.toCharArray();

		//push elements to deque
		for(char c :array) {
			deque.push(c);
		}
		
		//compare the first and last element from deque 
		//removeFirst() - return the top element from the queue
		//removeLast() - return the last element from the queue
		while(deque.size()>1) {
			if(deque.removeFirst()!=deque.removeLast()) {
				isPalindrome=false;
				break;
			}
		}
		System.out.print("Is it palindrome : " + isPalindrome);


	}

}
