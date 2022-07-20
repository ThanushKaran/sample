package org.string;

public class VowelAndConst {
	public static void main(String[] args) {
		String s="Automation Testing";
		int count = 0,num=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if( c =='a'|| c == 'e'|| c=='i' || c=='o' || c=='u') {
				count++;
			}
			else {
				num++;
			}
		}
		System.out.println("No.Of Vowels:"+count );
		System.out.println("No.Of Constants:"+num);
	}

}
