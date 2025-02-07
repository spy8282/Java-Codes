import java.util.Scanner;
class LogicalTwo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		String out = (num%2==0 && num%5==0)?("HiTwoHiFive"):((num%2==0)?("hiTwo"):(num%5==0)?("hiFive"):("blank"));
		
		System.out.print(out);
		
	}
}
