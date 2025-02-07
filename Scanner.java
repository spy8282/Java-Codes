import java.util.Scanner
class Scan 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1 = sc.nextint();
		System.out.print("Enter number2:");
		int num2 = sc.nextint();
		int add = num1+num2;
		System.out.println(add);
	}
}
