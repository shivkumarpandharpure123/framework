package practise;

public class pyramid {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++)//line
		{
			for(int b =5;b>=a;b--)//space
		{
			System.out.print(" ");
		}
			for(int c =1;c<=a;c++)
			{
				System.out.print(" *");
			}
			System.out.println();
			
		}
		for(int a=4;a>=1;a--)//line
		{
			for(int b =5;b>=a;b--)//space
		{
			System.out.print(" ");
		}
			for(int c =1;c<=a;c++)
			{
				System.out.print(" *");
			}
			System.out.println();
	}

}
}