package org.string;

public class StringReverse {
	public static void main(String[] args) {
	String s="Automation Testing";
	
		/*StringBuilder revString=new StringBuilder(s);
		revString.reverse();
		System.out.println(revString.toString());*/
	
	//another method
	
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			System.out.print(c);
			
		}
				
	}

}
