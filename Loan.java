import java.util.Scanner;
class Loan 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		int a = month / 12;
		int b = month % 12;
		String str = a+"."+b;
		float c = float.parseFloat(str);
		System.out.println(a+(b/10.0));
	}
}
