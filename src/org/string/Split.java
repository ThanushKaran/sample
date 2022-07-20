package org.string;

public class Split {
	public static void main(String[] args) {
		String s="Automation Testing";
		int split = s.split(" ").length;
		System.out.println("No of Words in a String :"+split);
		
		for (String string : s.split(" ")) {
			System.out.println(string);
			
		}
}
}