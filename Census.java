class Census
{
	public static void main(String[] args) 
	{
		long curPop = 312032486;
		final long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long imm = seconds/45;
		
		long newPop = curPop+birth-death+imm;
		System.out.println("Current Population is: "+ curPop);
	    System.out.println("New Population is: "+ newPop);
		

	}
}
