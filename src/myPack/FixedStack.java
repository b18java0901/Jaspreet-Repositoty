package myPack;

import java.util.Scanner;

public class FixedStack implements Stack{
	public void push(int I)
	{
		int size;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size ");
		size=s.nextInt();
		if(size>I)
			System.out.println("Stack Overflows");
		else
		System.out.println("Stack Works");
	}
	public int pop()
	{
		return(0);
	}

}
