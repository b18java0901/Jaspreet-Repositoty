import java.util.Scanner;

public class Grade {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the marks");
		int n =s.nextInt();
		if(n>=85)
		{
			System.out.println(" Your grade is excellent");
		}
		else if(n>=70 && n<80)
		{
			System.out.println("Your grade is very good");
		}
		else if(n>=50 && n<70)
		{
			System.out.println("Your grade is good");
		}
		else if(n>=40 && n<50)
		{
			System.out.println("Your grade is average");
		}
		else
			System.out.println("You are fail");

	}

}
