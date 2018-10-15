import java.util.Scanner;

public class Maxnumber {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the elements");
		int [][] arr=new int[3][];
		arr[0]=new int[4];
		arr[1]= new int[2];
		arr[2]= new int[3];
		for(int i=0;i< arr.length ;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
			arr[i][j]=s.nextInt();
			}
		}
		int max= arr[0][0];
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		System.out.println("Maximum number is "+ max);
	}

}
