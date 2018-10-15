import java.util.Scanner;

public class Minimun 
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=s.nextInt();
	int [] arr = new int [n];
	System.out.println("Enter the elements");
	
	for(int i=0; i< arr.length; i++)
	{
		arr[i]=s.nextInt();
	}
	int mini = arr [0];
	for(int i=0; i< arr.length; i++)
	{
		if(arr[i]< mini)
			mini=arr[i];
		
	}
	System.out.println("Smallest number is" + mini); 
		
	}
}
