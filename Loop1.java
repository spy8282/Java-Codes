class Loop1 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i<=10 ; i++ )
		{
			System.out.println(i+ " ");
		}
		
		for (char ch = 'A'; ch<='Z' ; ch++ )
		{
			System.out.println(ch+ " ");
		}
		
		for (char ch = 'Z'; ch>='A'; ch-- )
		{
			System.out.println(ch+ " ");
		}
		
		for (char ch = '0'; ch<='9'; ch++)
		{
			System.out.println(ch+ " ");
		}
		
		for (int i = 0 ; i<=127 ; i++)
		{
		
			System.out.println(i + " : " + (char(i)));
		}
	
	}
		
}
