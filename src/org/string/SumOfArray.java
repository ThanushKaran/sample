package org.string;

public class SumOfArray {
	public static void main(String[] args) {
		int sum=0;
		int[] a=new int [5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
		}
		int avg = sum/a.length;
System.out.println("sum of no :"+sum);
System.out.println("Average of no :"+avg);
		
	}

}
