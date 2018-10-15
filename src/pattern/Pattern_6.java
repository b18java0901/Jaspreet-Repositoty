package pattern;

public class Pattern_6 {

	public static void main(String[] args) {
	for(int i=1; i<=3; i++)
	{
		int x=97;
		for(int j=2; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print((char)x);
			x++;
		}
		int y=x-2;
		for(int l=2; l<=i; l++)
		{
			System.out.print((char)y);
			y--;
		}
		System.out.println("");
	}
	for(int i=1; i<=2; i++)
	{
		int x=97;
		for(int j=1; j<=i; j++)
		{
			System.out.print(" ");
		}
		for(int k=2; k>=i; k--)		{
			System.out.print((char)x);
			x++;
		}
		int y=x-2;
		for(int l=1; l>=i; l--)
		{
			System.out.print((char)y);
			y--;
		}
		System.out.println("");
	}
	}

}
