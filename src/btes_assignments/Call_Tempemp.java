package btes_assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Call_Tempemp {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char ch='y';
			TemporaryEmp te= new TemporaryEmp();
			do
			{
				System.out.println("Chose Your option\n 1.Calculate Balance leaves\n 2.Avail Leave\n 3.Calculate Salary");
		        int chose=Integer.parseInt(br.readLine());
		        switch (chose)
		        {
		        case 1:
		        	te.calculate_balance_leaves();
		        	break;
		        case 2:
		        	System.out.println("Enter the number of leaves");
		        	int no_of_leaves=Integer.parseInt(br.readLine());
		        	System.out.println("Enter the type of leaves \n 1.Press l for leave");
		        	char type_of_leave= br.readLine().charAt(0);
		        	te.avail_leave(no_of_leaves, type_of_leave);
		        	break;
		        case 3:
		        	te.calculate_salary();
		        	break;
		        }
		        System.out.println("Do you want to Continue\n enter y for Yes\n enter n for No");
		        ch=br.readLine().charAt(0);              
				}while(ch=='y');
			}
	}


