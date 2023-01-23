package practise;

import java.util.Arrays;

public class DESENDINGORDE {
	public static void main(String[] args) {
	
	int a[]= {10,27,5,7,50,40,60};
	
	System.out.println("size of Array ===>"+a.length);

	Arrays.sort(a);
	
	System.out.println("====original array====");
	
	for(int i=0;i<a.length;i++) 
	{
		System.out.print(a[i]+ ",");
	}
	System.out.println();
	
	System.out.println("====reverse  array====");
	
	for(int j=a.length-1; j>=0; j--)
	{
		System.out.print(a[j]+",");
	}
	
	}
}
