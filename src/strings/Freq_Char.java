package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Freq_Char {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s =br.readLine();
		char s1='l';
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
		if(s.charAt(i)==s1)
		{
			System.out.println(s1);
			count++;
		}
		}
		System.out.println(count);
	}

}
