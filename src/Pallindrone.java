import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrone {

	public static void main(String[] args) throws IOException
	{
		int sum =0;
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int num =Integer.parseInt(s.readLine());
		int temp=num;
		while(num>0) 
		{
			int r= num%10;
			num= num/10;
			sum= sum*10+r;
		}
		if(sum==temp)
		{
			System.out.println("Number is Pallindrone");
		}
		else
			System.out.println("Number is not Pallindrone");
			
	}

}
