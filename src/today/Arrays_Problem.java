package today;

import java.util.Arrays;

public class Arrays_Problem {

	public static void main(String[] args) {

		String arr[] = new String[6];
		
		arr[0]="Somnath";
		arr[1]="Shivkumar";
		arr[2]="Akshay";
		arr[3]="Ravi";
		arr[4]="Pratik";
		arr[5]="Kartik";
		
		System.out.println(arr[3]);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("===================");
		
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
