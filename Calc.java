import java.util.Scanner;
class Calc

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter num1: ");
		float num1 = sc.nextFloat();
		
		System.out.print("Enter num2: ");
		float num2 = sc.nextFloat();
		
		System.out.print("Enter Operator: ");
		char ch = sc.next().charAt(0);
		
		float opt = 0;
		
		opt = (ch == '+')?(num1 + num2):
			  (ch == '-')?(num1 - num2):
			  (ch == '*')?(num1 * num2):
			  (ch == '/')?(num1 / num2):
			  (ch == '%')?(num1 % num2):0.00001F;
		
		String output = num1 +" "+ch +" "+num2 +" = "+opt;
		
		if (!(opt == 0.0000F))
		{
			System.out.println(output);
		}
		
		
		
		
	}
}
