package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_Search {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s =br.readLine();
		String s1="chandigarh";
		int count=0;
		String[] ar=s.split(" ");
		for(int i=ar.length-1;i>=0; i--)
		{
			if(ar[i].equals(s1))
			{
				System.out.println("Word found is " + s1);
				count++;
			}	
		}
		System.out.println(count);
	}
}
