package practise;

public class sumofnumbres {

	public static void main(String[] args) {
		
		String s= " hellosomnath81sfg4";

		String num  ="";

		int sum =0;

		for( int i=0; i<s.length(); i++)
		{
	
			if(Character.isDigit(s.charAt(i)))
			{
				num= num+s.charAt(i);	
			}
			else 
			{
				if (!num.equals("")) 
				{
					sum= sum+Integer.parseInt(num);
					num="";
				}
			}	
		}

		System.out.println(sum);

	}

}
