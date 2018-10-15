
public class Demo_Const {
	int x,y;
	Demo_Const()
	{
		System.out.println("Default Constructor");
	}
	Demo_Const(int a ,int b)
	{
		x=a;
		y=b;
	}
	void show()
	{
		System.out.println("Value of x = "+ x);
		System.out.println("Value of y = "+ y);
	}
	public static void main(String[] args) 
	{
		Demo_Const obj = new Demo_Const();
		Demo_Const obj1 = new Demo_Const(10,20);
		obj.show();
		obj1.show();
	}

}
