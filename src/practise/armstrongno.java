package practise;


public class armstrongno {

	public static void main(String[] args) {

		int p,q,r,sum;
		
		p=1;
		q=5;
		r=3;
		
		sum=(p*p*p)+(q*q*q)+(r*r*r);
		
		if(153==sum)
		{
			System.out.println("No is Armstrong");
		}
		else
		{
			System.out.println("No is not Armstrong");
		}
	
		 
		 
	}

}
