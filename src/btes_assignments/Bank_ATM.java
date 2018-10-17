package btes_assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Insuficient_Balance_Exception extends Exception
{
	Insuficient_Balance_Exception(String s)
	{
		super(s);
	}
}

public class Bank_ATM 
{
	double balance=0;
	double atmpin;
	double withdraw;
	double deposite;
	public static void main(String[] args) throws IOException 
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Bank_ATM a = new Bank_ATM();
		char ch='y';
		do 
		{
			System.out.println("Enter the option\n1.Withdraw \n2.Deposite \n3.Balance Enquiry");
			int choose=Integer.parseInt(b.readLine());
			
			switch(choose)
			{
			case 1:
				a.withdraw();
				break;
			
			case 2:
			a.deposite();
			break;
			
			case 3:
			a.balance_enquiry();
			break;
			}	
		System.out.println("Do you want to Continue\n enter y for Yes\n enter n for No");
	    ch=b.readLine().charAt(0);
		}while(ch=='y');
	}

	
	public void withdraw()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("Enter ATM pin");
			atmpin=Double.parseDouble(br.readLine());
			System.out.println("Enter the amount to withdraw");
			withdraw=Double.parseDouble(br.readLine());
			if (balance>10000)
			{
				 balance= balance-withdraw;
				if(balance>10000)
				System.out.println("Your new balance is"+ balance);
				else
					System.out.println("Please Maintain Minimum 10000 Balance");
					
			}
			else if(balance <10000)
				throw new Insuficient_Balance_Exception("Minimum Balance should be 10,000.\nPleasey add more money");
			System.out.println(balance);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	public void deposite() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ATM pin");
		atmpin=Double.parseDouble(br.readLine());
		System.out.println("Enter the amount to be Deposite");
		deposite=Double.parseDouble(br.readLine());
		balance = balance+deposite;
		System.out.println("Your new Balance is "+ balance);
	}
	public void balance_enquiry() throws  IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ATM pin");
		atmpin=Double.parseDouble(br.readLine());
		System.out.println("your available balance is :: "+balance);
	}

	

}
