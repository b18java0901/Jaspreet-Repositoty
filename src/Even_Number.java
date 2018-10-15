
public class Even_Number {

	public static void main(String[] args) {
		int n=100;
		int count=0;
		System.out.print("Even Numbers are");
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
			count++;
			System.out.print(" "+i);
			}
		}
		System.out.println("");
		System.out.println("Total Even Numbers between 1- 100 are " +count );
	}

}
