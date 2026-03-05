package com.PalindromeChecker;
/** 
 * =========================================
 *MAIN CLASS- UseCaseEleven - PalindromeChecker
 *===========================================
 *
 *UseCase 11 : APPLICATION : Palindrome checker using object oriented design
 *
 *Description:
 *----Palindrome logic is encapsulated inside PalindromeService
 *----This improves readability, reusability and separation of concerns

 *@author Harsheen Kaur
 *@version 11.0
 * */
public class UseCaseEleven {
	//hard code input string
	public static void main(String args[]) {
	String str="madam";
	
	//call to static function of PalindromeService class
	boolean value = PalindromeService.palindrome_Checker(str);
	
	//print the input string
	System.out.println("The input string is : " + str);
	
	//print the resultant 
	System.out.print("Is it palindrome : " + value);

}
}
class PalindromeService{
	public static boolean palindrome_Checker(String input){
		//convert input string to array of chars
		char[] input_array=input.toCharArray();

		//initialize start and end pointer
		int start=0;
		int end=input_array.length-1;
		boolean isPalindrome=true;

		//compare element at start with the element at end
		while(start<end) {
			if(input.charAt(start)!=input.charAt(end)) {
				isPalindrome=false;
				break;
			}
			start++;
			end--;
		}
		return isPalindrome;
	}


}
