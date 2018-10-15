
public class Diamondpattern 
{
	
public static void main(String args[])
	{
	int x,y;
	for(int i=1; i<=3; i++)
	{
		x=97;
		for(int j=3; j>i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print((char)x);
			x++;
		}
		y=x-2;
		for(int l=2; l<=i; l++)
		{
			System.out.print((char)y);
			y--;
		}
		System.out.println("");
	}
	for(int i=1; i<=2; i++)
	{
		x=97;
		for(int j=1; j<=i; j++)
		{
			System.out.print(" ");
		}
		for(int k=2; k>=i; k--)
		{
			System.out.print((char)x);
			x++;
		}
		for(int l=i; l<=1; l++)
		{
			y=x-2;
			System.out.print((char)y);
		}
		System.out.println("");
	}
	}
}