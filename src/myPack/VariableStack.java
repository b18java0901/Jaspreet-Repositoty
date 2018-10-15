package myPack;

import java.util.Scanner;

	public class VariableStack implements Stack
	{	
		
		public void push(int I)
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the Size ");
			int size=s.nextInt();
			if(size>I) 
			{
				size=I;
				System.out.println("Stack Works");
			}
			else
				System.out.println("Right Size");
				
		}
		public int pop()
		{
			return(0);
		}
	}
