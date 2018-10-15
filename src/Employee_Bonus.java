import java.util.Scanner;

public class Employee_Bonus {

	public static void main(String[] args) 
	{
        
	    Employee_Bonus b=new Employee_Bonus();
        b.calculate_bonus();
        
	}
	void calculate_bonus()
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the grade");
        char grade=s.nextLine().charAt(0);
        System.out.println("Enter the basic salary");
        double basic=s.nextDouble();
        
		if(basic >= 20000 && grade=='m')
			{
            	System.out.println("bonus is 10000");
			}
	
		else if(basic<20000 && grade=='m')
			{
            	System.out.println("bonus is 7000");
            }
		else if(basic>=15000 && grade=='e' )
			{
            	System.out.println("bonus is 5000");
			}
		else if(basic<15000 && grade=='e' )
			{
				System.out.println("bonus is 3000");
			}
        }
}
