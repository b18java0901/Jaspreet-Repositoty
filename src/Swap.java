import java.util.Scanner;

public class Swap 
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int x= s.nextInt();
	int y=s.nextInt();
	int temp;
	System.out.println("Swapped numbers are");
	temp =x;
	x=y;
	y=temp;
	System.out.println("x=" + x + " and y=" +y);
	}
}
