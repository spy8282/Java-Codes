import java.util.Scanner;
class AreaCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		float radius = sc.nextFloat();
		
		System.out.print("Enter Height: ");
		float height = sc.nextFloat();
		
		final float pi = 22/7;
		float area = pi*(radius*radius);
		float volume = area*height;
		
		System.out.println("Area: "+area+"cm^2");
		System.out.println("Volume: "+volume+"cm^3");
	}
}
