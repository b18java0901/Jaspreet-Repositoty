
public class Prime_Series {

	public static void main(String[] args) {
		int n =100;
		for(int i=2; i<=n; i++) 
		{
			boolean IsPrime= true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0) 
				{
					IsPrime=false;
					break;
				}
			}
			if(IsPrime==true)
			{
				System.out.print(" "+i);
			}
		}	
	}

}
