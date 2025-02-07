import java.util.Scanner;
class Area 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius:");
		float r = sc.nextFloat();
		final float pi = 22/7;
		float radius = pi*(r*r);
		float peri = 2*pi*r;
		System.out.println("Area of circle: "+radius+"cm^2");
		System.out.println("Perimeter of circle: "+peri+"cm^2");
		
		
			
	}
}
