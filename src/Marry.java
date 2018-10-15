import java.util.Scanner;

public class Marry {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the gender");
		char gender=s.nextLine().charAt(0);
		System.out.println("Enter your age");
		int age=s.nextInt();
		if(gender=='m' && age>21)
		{
			System.out.println("Yes you can marry");
		}
		else if(gender=='f'&& age>18)
		{
			System.out.println("Yes you can marry");
		}	
		else
			System.out.println("You are not eligible to marry");
	}

}
