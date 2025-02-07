import java.util.Scanner;
class AreaRectangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Height: ");
		float height = sc.nextFloat();
		
		System.out.println("Enter Width: ");
		float width = sc.nextFloat();
		
		float res = width*height;
		System.out.println("Area of Rectangle: "+res+"cm^2");
		
		
			
	}
}
