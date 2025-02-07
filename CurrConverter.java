import java.util.Scanner;
class CurrConvert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("          CURRENCY CONVERTER");
		System.out.println();
		
		System.out.println("Enter Currency in (INR): ");
		float currInr = sc.nextFloat();
		
		System.out.println();
		System.out.println("*****LIST OF CURRENCY*****");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. YEN");
		System.out.println("4. PKR");
		System.out.println("4. AUD");
		System.out.println("4. GBP");
		System.out.println("4. CAD");
		
		System.out.println("Enter Currency: ");
		String Curr = sc.next().toUpperCase();
		
		float curr = 0;
		
		if (Curr.equals("USD"))
		{
			curr = currInr/86.56F;
			System.out.println(currInr + " INR = " + curr + " USD " );
		}
		else if (Curr.equals("EUR"))
		{
			curr = currInr/90.20f;
			System.out.println(currInr + " INR = " + curr + " EUR ");
		}
		else if (Curr.equals("YEN"))
		{
			curr = currInr/0.55f;
			System.out.println(currInr + " INR = " + curr + " YEN " );
		}
		else if (Curr.equals("PKR"))
		{
			curr = currInr/0.31f;
			System.out.println(currInr + " INR = " + curr + " PKR " );
		}
		else if (Curr.equals("AUD"))
		{
			curr = currInr/53.82f;
			System.out.println(currInr + " INR = " + curr + " AUD " );
		}
		else if (Curr.equals("GBP"))
		{
			curr = currInr/0.92f;
			System.out.println(currInr + " INR = " + curr + " GBP " );
		}
		else if (Curr.equals("CAD"))
		{
			curr = currInr/1.66f;
			System.out.println(currInr + " INR = " + curr + " CAD " );
		}
		else if (Curr.equals("SGD"))
		{
			curr = currInr/64.10f;
			System.out.println(currInr + " INR = " + curr + " SGD " );
		}
		else
		{
			System.out.println("INVALID");
		}
		
		
	}
}
