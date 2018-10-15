
public class Primepattern 
{
	public static void main(String[] args) 
	{
	int count;	
	for(int i=1; i<=5;i++)
	{
		count=1;
		for(int j=1; j<=i*2; j++)
		{
			boolean isPrime=true;
			for(int k=2; k<j;k++) 
			{
			if(j%k==0)
				{
				isPrime=false;
				break;
				}
			}
			if(isPrime==true&& count<=i)
			{
				System.out.print(j);
				count++;
			}
		}
		System.out.println("");
	}
	}
}


