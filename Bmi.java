import java.util.Scanner;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight: ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		
		
		double bmi = weight*0.45359237/(height*0.0254*height*0.0254);
		System.out.println(bmi);
	}
}
