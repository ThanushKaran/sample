package org.string2;

public class Palindrome {
	public static void main(String[] args) {
		int num =12321;
		int input =num;
		int rem=0,res=0;
		while (num>0) {
			
		rem=num%10;
		
		res=(res*10)+rem;
		
		num=num/10;
		
		}	
		if (input==res) {
			System.out.println("palindrome");
			
		} else {
			System.out.println("Not a palindrome");

		}
	}

}
