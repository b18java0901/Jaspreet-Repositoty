import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int sum=0;
		int temp,r;
		BufferedReader s= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int num =Integer.parseInt (s.readLine());
		temp=num;
		while(num>0)
		{
		r=num%10;
		num= num/10;
		sum=sum+r*r*r;
		}
		if(sum==temp)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}

}
