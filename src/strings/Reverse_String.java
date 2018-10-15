package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_String {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s= br.readLine();
		for(int i=s.length()-1; i>=0; i--) 
		{
			System.out.print(s.charAt(i));
			
		}
	}
}
