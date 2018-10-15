package btes_assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int empId;

	String empName;

	int total_leaves;

	double total_salary;
	
	void calculate_balance_leaves() 
	{
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		return true;
	}

	void calculate_salary()
	{}
}
class  PermanentEmp extends Employee
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int paid_leave, sick_leave, casual_leave;

	double basic, hra,pfa;
	
	PermanentEmp()throws IOException
	{
		total_leaves=30;
		paid_leave=10;
		sick_leave =10;
		casual_leave=10;
		
		System.out.println("Enter the Employee Name");
		empName=br.readLine();
		System.out.println("Enter the Employee ID");
		empId=Integer.parseInt (br.readLine());
		System.out.println("Enter the basic Salary");
		basic=Double.parseDouble(br.readLine());
	}
	
	void print_leave_details() 
	{
		System.out.println("Paid_leave= "+paid_leave);
		System.out.println("Sick_leave= "+sick_leave);
		System.out.println("Casual_leave= "+casual_leave);
	}

	void calculate_balance_leaves() 
	{
		total_leaves=paid_leave+casual_leave+sick_leave;
		System.out.println("total leaves= "+total_leaves);
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
			if(type_of_leave=='s')
			{
				if(sick_leave<no_of_leaves)
					return false;
				else 
				{
					sick_leave=sick_leave-no_of_leaves;
					return true;
				}
			}
			else if(type_of_leave=='c')
			{
				if(casual_leave<no_of_leaves)
					return false;
				else
				{
					casual_leave=casual_leave-no_of_leaves;
					return true;
				}
			}
			else if(type_of_leave=='p')
			{
				if(paid_leave<no_of_leaves)
					return false;
				else
				{
					paid_leave=paid_leave-no_of_leaves;
					return true;
				}
			}
			else
				return true;
		}

	void calculate_salary() 
	{
		hra= 0.5*basic;
		pfa= .12*basic;
		total_salary= basic+hra-pfa;
		System.out.println("Net Salary="+total_salary);
	}
};
class TemporaryEmp extends Employee
{
	double basic;
	int leave;
	BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	TemporaryEmp() throws IOException
	{
		basic=30000;
		total_leaves=10;
		leave=10;
		System.out.println("Enter the Employee Name");
		empName=s.readLine();
		System.out.println("Enter the Employee ID");
		empId=Integer.parseInt(s.readLine());
	}
	void calculate_balance_leaves() 
	{
	total_leaves=leave;
	System.out.println("total leaves ="+ total_leaves);
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		if(type_of_leave=='l')
		{
			if(leave<no_of_leaves)
				return false;
			else
			{
			leave= leave-no_of_leaves;
			return true;
			}
		}
		return true;
	}

	void calculate_salary() 
	{
		total_salary= basic;
		System.out.println("Net Salary="+total_salary);
	}
}