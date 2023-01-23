package practise;

import java.util.Scanner;

public class primenumber {
	
	public static void main(String[] args) {
		
		int i;
		
		System.out.println("====Enter Any Number====");
		
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		for( i=2;i<num;i++)   
		
			if(num%i==0)   //12%
				
				break;
			
			if(i==num)
			{
				System.out.println("Given No is Prime Number");
			}
			else
			{
				System.out.println("Given No is not Prime Number");
			}
			
	}

}
