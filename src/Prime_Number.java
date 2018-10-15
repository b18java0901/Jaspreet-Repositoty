import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= s.nextInt();
		boolean IsPrime= true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				IsPrime=false;
				break;
			}
		}
		if(IsPrime==true)
		{
		System.out.println("The entered number is prime " +n);
		}
		else
		System.out.println("The entered number is not prime " +n);
	}

}
