package strings;

public class Pallindrone_String {

	public static void main(String[] args) {
		String s= "ad3bd";
		String s1="";
		for(int i=s.length()-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		if(s1.equals(s))
		{
			System.out.println("String is pallindrone");
		}
		else
		{
			System.out.println("String is not pallindrone");
		}

	}

}
