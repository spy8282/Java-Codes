
class Multi 
{
	public static void main(String[] args) 
	{
		int num = 321;
	    int multi = 1;
	    int rem = 0;
		
		rem = num%10;
		multi *= rem;
		num /= 10;
		
		rem = num%10;
		multi *= rem;
		num /= 10;
		
		rem = num%10;
		multi *= rem;
		
		System.out.println(multi);


	}
}
