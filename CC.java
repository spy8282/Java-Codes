import java.util.Scanner;
class CC 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("          CURRENCY CONVERTER");
		System.out.println();
		System.out.print("Enter currency in (INR): ");
		float inr = sc.nextFloat();
		System.out.println();
		
		System.out.println("*****LIST OF CURRENCY*****");
		System.out.println();
		System.out.println("1. USD");
		System.out.println("2. EUR");
		
		
		String curr = sc.next().toUpperCase();
		float conv = 0;
		
		if (curr.equals("USD"))
		{
			conv = inr/86.56f;
			System.out.println(conv);
			
		}
		else if (curr.equals("EUR"))
		{
			conv = inr/90.20f;
			System.out.println(conv);
			
		}
		else 
		{
			System.out.println("INVALID");
			
		}
		
	}
}
