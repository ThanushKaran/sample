package org.string;

public class FindPosition {

		public static void main(String[] args) {
			String s="Automation Testing";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if( c == 't') {
					System.out.println("the position of t is  :"+i);
				}
			}
		}
}


