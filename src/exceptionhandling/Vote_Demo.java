package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Invalid_Age extends Exception
{
	Invalid_Age(String s)
	{
	super(s);
	}
}
public class Vote_Demo {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the age");
			int age= Integer.parseInt(br.readLine());
			if(age<18 || age>120)
			
			throw new Invalid_Age("Invalid age.\nEnter the Age again");
			System.out.println("Your vote is counted");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
