import java.util.Scanner;
class Marks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks: ");
		int num = sc.nextInt();
		
		double per = (num*100 )/600;
		
		String op = (per >= 75)?("Grade A"+per+"%"):
			        (per >= 60)?("Grade B"+per+):
			        (per >= 35)?("Grade C"+per+):
			        "Failed"
		
		System.out.println(op);
		
	}
}
