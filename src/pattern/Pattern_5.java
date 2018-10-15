package pattern;

public class Pattern_5 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			int count=1;
			for(int j=1; j<=i+3; j++)
			{
				boolean isprime =true;
				for(int k=2; k<j; k++)
				{
				if(j%k==0)
				{
					isprime=false;
					break;
				}
				}
				if(isprime==true && count<=i)
				{
					System.out.print(j);
					count++;
				}	
			}
			System.out.println("");
		}
	}

}
