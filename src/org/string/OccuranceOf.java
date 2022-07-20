package org.string;

public class OccuranceOf {
	public static void main(String[] args) {
		String s="Automation Testing";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='t') {
				count++;
			}
			else if (c=='T') {
				count++;
			}
		}
		System.out.println(count); 
	}
}
