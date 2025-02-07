import java.util.Scanner;
class LoopSum 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int num = sc.nextInt();
		 
		int sum = 0;
		
		while (num>0)
		{
			int rem = num%10;
			sum += rem;
			num /= 10;
		}
		System.out.println(sum);
		
		}
		
		
	}
}
