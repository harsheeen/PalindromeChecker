package com.PalindromeChecker;
import java.util.*;
/** 
 * =========================================
 *MAIN CLASS- UseCaseFive - PalindromeChecker
 *===========================================
 *
 *UseCase 6 : APPLICATION : Palindrome checker using stack and queue
 *
 *Description:
 *----Hard code the input string
 *----Initialize a stack and a queue using collection interface
 *----Convert the string to charArray and push it to stack and enqueue the queue 
 *----Simultaneously compare the elements that are popped and dequeued
 *----If the elements are equal, continue the iteration
 *----Else, return false
 *----If yes - print "Is it Palindrome-True!"
 *----If no - print "Is it Palindrome-False!"
 *
 *@author Harsheen Kaur
 *@version 6.0
 * */
public class UseCaseSix {
	public static void main(String args[]) {
		//Using collections for stack and queue
		Stack<Character> stack=new Stack<Character>();
		Queue<Character> queue=new LinkedList<Character>();
		
		//Hard code the input string
		String input="madam";
		System.out.println("The input string is : " + input);
		
		//boolean variable to consider isPalindrome be true or false
		boolean isPalindrome=true;
		
		//convert array to charArray
		char[] array=input.toCharArray();
		
		//push and add the elements in stack and queue
		for(int i=0;i<array.length;i++) {
			stack.push(array[i]);
			queue.add(array[i]);
		}
		
		//pop and poll from stack and queue and compare them, return true if they match else false
		for(int i=0;i<array.length;i++) {
			if(stack.pop()!=queue.poll()) {
				isPalindrome=false;
				break;
			}
				
		}
		
		System.out.print("Is it palindrome :  " + isPalindrome);
		
		
		
	}

}
