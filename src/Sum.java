
public class Sum {
	static int a=10;
	static int b=20,c;
	public static void main(String[] args) 
	{
		Sum s=new Sum();
		s.sum();
		s.sum1();
		int res=c;
		System.out.println(res);
		s.sum2(a,b);
		s.sum3(a,b);
		int res1=c;
		System.out.println(res1);
	}
	void sum()
	{
		c=a+b;
		System.out.println(c);
	}
	int sum1()
	{
		c=a+b;
		return c;
	}
	void sum2(int a, int b)
	{
		c=a+b;
		System.out.println(c);
	}
	int sum3(int a,int b)
	{
		c=a+b;
		return c;
	}

}
