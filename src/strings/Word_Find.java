package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_Find {

	public static void main(String[] args) throws IOException 
	{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String s =br.readLine();
	System.out.println("Enter the word to search");
	String s1=br.readLine();
	String s2="";
	int count=0;
	int l=0;
	for(int i=0; i<s.length();i++)
	{
		if(s.charAt(i)==' ') 
		{
		s2=s.substring(l, i);
		l=i+1;
		if(s2.equals(s1))
		{
			System.out.println("The searched word is "+s2);
			count++;
		}
		}
		
	}
	System.out.println("The frequency of word is "+count);
	
	}

}
