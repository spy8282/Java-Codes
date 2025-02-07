class Largest 
{
	public static void main(String[] args) 
	{
		int a = 6;
		int b = 5;
		int c = 7;
		
		int large = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(large);
	}
}
