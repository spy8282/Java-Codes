class ReverseNumber
{
	public static void main(String[] args) 
	{
		int num = 123;
		int dup = num;
		int rev = 0;
		
		int rem = num%10; // 123%10 -> 3
		rev = rev*10 + rem;
		
		num = num/10; // 123/10 -> 12
		rem = num%10; // 12%10 -> 2
		rev = rev*10 + rem;
		
		num = num/10; // 12/10 -> 1
		rem = num%10; // 1%10 -> 1
		rev = rev*10 + rem;
		
		System.out.println(dup+" : "+rev);
		
	}
}
