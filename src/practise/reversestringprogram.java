package practise;

import java.util.Arrays;

public class reversestringprogram {
	public static void main(String[] args) {
		String s ="Somnath";
		
		int b = s.length();
		
		String rev="";
		
		for(int i=b-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse Given String===>"+rev);
		
		int[]c= {12,10,45,-40,38};
		
		Arrays.sort(c);
		
		System.out.println("Given Array in Assending Order ===>"+Arrays.toString(c));
		
//		for(int j=0; j<=c.length-1; j++)
//		{
//    	  System.out.print(c[j]+",");
//		}
		
	}

}
