package practise;

public class febonaci {
	
	// print 1 to 10 no in febonaci series .
	
public static void main(String[] args) {
	

	int a= 0;
	int b= 1;
	int c = 0;
	
		System.out.print("Fabonocci series ===>");
	
		for(int i= 1; i<=10; i++)
		{
			c = a+b;
			
			System.out.print(c+",");
		
			a=b;   // swapping concept.  
			b=c; 
		}
		
		System.out.println();
		
		System.out.print("Fabonacci last given no ===>"+c);
	}

}
