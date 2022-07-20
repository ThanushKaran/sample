package org.string;

public class MonNoValidOrNot {
	public static void main(String[] args) {
		String phNo = "98@  4230010";
		int res=0;
for (int i = 0; i < phNo.length(); i++) {

	char ch = phNo.charAt(i);

	if (!Character.isDigit(ch)) {
		res=1;
		break;
	}
}

if (res==0) {
	System.out.println("Number valid");
}
else {
	System.out.println("number is invalid");
}
}
}