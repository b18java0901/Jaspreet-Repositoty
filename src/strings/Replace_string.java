package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace_string {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s= br.readLine();
		for(int i=s.length()-1;i>=0; i--)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				s=s.replace(s.charAt(i), '$');
			}
		}
		System.out.println("Your new String is\n"+s);
	}

}
