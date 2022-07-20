package org.string2;

public class ReverseString {
	public static void main(String[] args) {
		int num =12345678;
		int rem=0,res=0;
		
		while (num>0) {
			
			rem=num%10;
			
			res=(res*10)+rem;
			
			num=num/10;
			
		}
		System.out.println("After Reversing "+res);
	}
	

}
