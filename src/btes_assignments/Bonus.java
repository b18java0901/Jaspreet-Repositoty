package btes_assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bonus {
	
	static char grade ;
	static double basic;
	double bonus;

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Basic Salary ");
		basic=Double.parseDouble(br.readLine());
		System.out.println("Enter your grade");
		grade=br.readLine().charAt(0);
		Bonus b = new Bonus();
		b.calculate_bonus();
	}
	
	public void calculate_bonus()
	{
		if(basic>=20000 && (grade=='m'||grade=='M'))
		{
			bonus=10000;
			System.out.println("Your bonus is "+bonus);
		}
		else if(basic<20000 && (grade=='m'||grade=='M'))
		{
			bonus=7000;
			System.out.println("Your bonus is "+bonus);
		}
		else if(basic>=15000 && (grade=='e'||grade=='E'))
		{
			bonus=5000;
			System.out.println("Your bonus is "+bonus);
		}
		else if(basic<15000 && (grade=='e'||grade=='E'))
		{
			bonus=3000;
			System.out.println("Your bonus is "+bonus);
		}
	}

}
