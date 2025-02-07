import java.util.Scanner;
class Scan
{
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("enter numnber1:");
		int num1 = sc.nextInt();
		
		System.out.print("enter number2:");
		int num2 = sc.nextInt();
		
		int add = num1+num2;
		System.out.println(add);
		
	}
}