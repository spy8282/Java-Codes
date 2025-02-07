class SumOffAll 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int sum = 0;
		int rem = 0;
		
		rem = num%10;
		sum = sum+rem;
		num = num/10;
		
		rem = num%10;
		sum = sum+rem;
		num = num/10;
		
		rem = num%10;
		sum = sum+rem;
		
		System.out.println(sum);
	}
}
