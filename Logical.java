import java.util.Scanner;
class Logical1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a cahracter: ");
		char ch = sc.next().charAt(0);
		
		
		String a = (ch >='A' && ch <='Z')||(ch >='a' && ch <='z')?((ch >='a' && ch <='z')?
			(ch+"is a LowerCase alphabet"):(ch+"is a UpperCase alphabet"):
			((ch >='0' && ch <='9')?(ch+"is a digit"):(ch+"is a specail cahracter"));
		
		System.out.println(a);
	}
}
