package org.string;

public class NoInString {
	public static void main(String[] args) {
		String s="greens123Tech2022";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				System.out.println(c);
				
			}
			
		}
	}

}
