package btes_assignments;

import java.util.Scanner;

public class Figure {
	double dim1;
	void findArea()
	{}

	void findPerimeter()
	{}

	public static void main(String[] args) {
		Figure [] f= new Figure[6];
		for(int i=0; i<f.length; i++)
		{
			if(i<2)
			{
				f[i]= new Circle();
			}
			else if(i>=2 && i<4)
			{
				f[i]=new Rectangle();
			}
			else
				f[i]= new Triangle();
		}
		for(int i=0; i<f.length;  i++)
		{
				System.out.println(f[i].toString());
				f[i].findArea();
				f[i].findPerimeter();
		}
	}

}
class Circle extends Figure
{
	double pie;
	Circle()
	{
	 pie =3.14;
	}
	void findArea()
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the radius");
		double dim1=s.nextDouble();
		double ar =pie*dim1*dim1;
		System.out.println("Area is "+ ar);
	}

	void findPerimeter() 
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the radius");
		double dim1=s.nextDouble();
		double pr =pie*2*dim1;
		System.out.println("Perimeter is "+ pr);
	}
	public String toString()
	{
		System.out.println("Circle");
		return("");

	}

}

class Rectangle extends Figure
{
	double dim2, dim1;
	Rectangle()
	{
	}

	void findArea()
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the length");
		double dim1=s.nextDouble();
		System.out.println("Enter the Breath");
		double dim2=s.nextDouble();
		double ar =dim1*dim2;
		System.out.println("Area is "+ ar);
	}

	void findPerimeter() 
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the length");
		double dim1=s.nextDouble();
		System.out.println("Enter the Breath");
		double dim2=s.nextDouble();
		double pr =2*(dim1+dim2);
		System.out.println("Perimeter is "+ pr);
	}
	public String toString()
	{
		System.out.println("Rectangle");
		return("");
	}
}

class Triangle extends Figure
{
	double dim2, dim3;
	Triangle()
	{
	
	}
	void findArea()
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Base length");
		double dim2=s.nextDouble();
		System.out.println("Enter the height");
		double dim3=s.nextDouble();
		double ar =0.5*dim2*dim3;
		System.out.println("Area is "+ ar);
	}

	void findPerimeter() 
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the 1st side length");
		double dim1=s.nextDouble();
		System.out.println("Enter the 2nd side length");
		double dim2=s.nextDouble();
		System.out.println("Enter the 3rd side length");
		double dim3=s.nextDouble();
		double pr =dim1*dim2*dim3;
		System.out.println("Area is "+ pr);
	}
	public String toString()
	{
		System.out.println("Triangle");
		return("");
	}
}

