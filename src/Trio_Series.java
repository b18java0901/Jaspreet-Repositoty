
public class Trio_Series {

	public static void main(String[] args) {
		int a=3;
		int b=6;
		int c=11;
		int d;
		System.out.print(a+" "+b+" "+c);
		for(int i=0; i<5; i++)
		{
			d=a+b+c;
			System.out.print(" "+d);
			a=b;
			b=c;
			c=d;
		}
		
	}

}
