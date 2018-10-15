import java.util.Scanner;

public class Student {
	int roll_no;
	String name;
	char grade;
	double eng_marks, math_marks, sci_marks, total_marks, average;
	Scanner s= new Scanner(System.in); 
	Student()
	{
		System.out.println("Enter the name");
		name=s.nextLine();
		System.out.println("Enter the roll no");
		roll_no=s.nextInt();
		System.out.println("Enter the marks of english");
		eng_marks=s.nextFloat();
		System.out.println("Enter the marks of maths");
		math_marks=s.nextFloat();
		System.out.println("Enter the marks of science");
		sci_marks=s.nextFloat();
	}
	void cal_total()
	{
		total_marks=eng_marks+math_marks+sci_marks;
		System.out.println("Total marks is "+total_marks);
	}

	void cal_average()
	{
		average=total_marks/3;
		System.out.println("Average marks is "+average);
	}

	void find_grade()
	{
		if(total_marks>85)
		{
			System.out.println("Your grade is Execellent ");
		}
		else if(total_marks>70 && total_marks<85)
		{
			System.out.println("Your grade is Execellent ");
		}
		else if(total_marks>50 && total_marks<70)
		{
			System.out.println("Your grade is Execellent ");
		}
		else if(total_marks<50)
		{
			System.out.println("Your grade is Execellent ");
		}
	}

	public static void main(String[] args) 
	{
		Student obj =new Student();
		obj.cal_total();
		obj.cal_average();
		obj.find_grade();
	}

}
