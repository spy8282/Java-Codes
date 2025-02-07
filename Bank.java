import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String username1 = null;
		String password1 = null;
		String address = null;
		long contact = 0;
		double balance = 0.0;
		
		for (; ; )
		{
		    System.out.println("        WELCOME       ");
			System.out.println("    LAXMI CHIT FUND   ");
		    System.out.println();
		    System.out.println("1. EXISTING ACCOUNT");
		    System.out.println("2. CREATE ACCOUNT");
		    System.out.println("Enter an option: ");
			int opt = sc.nextInt();
			System.out.println();
			if (opt==1)
			{
				if (username1==null)
				{
					System.out.println("CREATE YOUR ACCOUNT FIRST");
					continue;
				}
				System.out.println(" LOGIN ");
				System.out.println();
				
				for (int i=3; i>=1; i--)
				{
					System.out.println();
					System.out.println("Username: ");
					String username = sc.next();
					System.out.println();
					System.out.println("Password: ");
					String password = sc.next();
					if (username.equals(username1) && password.equals(password1))
					{
						home:
						for (; ; )
						{
						System.out.println();
						System.out.println("  HOME PAGE  ");
						System.out.println();
						System.out.println("1. DEPOSIT");
						System.out.println("2. WITHDRAW");
						System.out.println("3. CHECK BALANCE");
						System.out.println("4. MINI STATMENT");
						System.out.println("5. LOGOUT");
						System.out.println();
						System.out.println("Enter an option: ");
						int opt1 = sc.nextInt();
						System.out.println();
						
						switch(opt1)
					    {
							case 1:{
								System.out.println("DEPOSIT");
								System.out.println();
								
								System.out.println("Enter the amount: ");
								double depositAmt = sc.nextDouble();
								balance += depositAmt;
								
								System.out.println("AMOUNT DEPOSITED SUCCESS");
								System.out.println();
								break;
							}
							case 2:{
								System.out.println("WITHDRAW");
								System.out.println();
								
								System.out.println("Enter the amount: ");
								double withdraw = sc.nextDouble();
								
								System.out.println("Enter the pin: ");
								String password3 = sc.next();
								if (password3.equals(password1))
								{
									if(withdraw<=balance){
										balance -= withdraw;
										System.out.println("AMOUNT DEBITED SUCCESS");
									}
									else{
										System.out.println("INSUFFICIENT FUNDS");
									}
										
										
								}
								else{
									System.out.print("WRONG PIN");
								}
								break;
							}
							case 3:{
								System.out.println("CHECK BALANCE");
								System.out.println();
								for (int j=3;j>=1 ;j--)
								{
									System.out.println();
									System.out.println("Enter pin: ");
									String password2 = sc.next();
									if (password2.equals(password1))
									{
										System.out.println("ACCOUNT BALANCE : "+ balance +"rs");
										continue home;
									}
									else{
										System.out.println("WRONG PIN");
										System.out.println("Attempt left: "+(j-1));
									}
								}
								System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED FOR 24 HOURS");
								System.exit(0);
							}
							case 5:{
								System.out.println("THANK YOU FORE USING OUR APP");
								System.out.println("VISIT AGAIN");
								System.exit(0);
							}
						}
						}
					
					}
					else if (opt==2)
					{
						System.out.println();
						System.out.println("ACCOUNT CREATION");
						System.out.println("Useranme: ");
						username1 = sc.next();
						
						System.out.println("Password: ");
						password1 = sc.next();
						
						System.out.println("ADDRESS: ");
						sc.nextLine();
						address = sc.nextLine();
						
						System.out.println("CONTACT: ");
					    contact = sc.nextLong();
						
						System.out.println("DEPOSIT AMOUNT: ");
						balance = sc.nextDouble();
						System.out.println();
						
						System.out.println("ACCOUNT CREATED SUCCESS ");
					}
					else{
						System.out.println("INVALID OPTION");
					}
					
					
					
				}
			}
		}
	}
}
