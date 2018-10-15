package btes_assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Call_Employee {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch='y';
        PermanentEmp pe= new PermanentEmp();
        do
        {
		
		System.out.println("Chose Your option\n 1.Print leave details\n 2.Calculate Balance leaves\n 3.Avail Leave\n 4.Calculate Salary");
        int chose=Integer.parseInt(br.readLine());
        switch (chose) 
        {
        case 1:
        pe.print_leave_details();
        break;
        case 2:
        	pe.calculate_balance_leaves();
        	break;
        case 3:
        	System.out.println("Enter the number of leaves");
        	int no_of_leaves=Integer.parseInt(br.readLine());
        	System.out.println("Enter the type of leave\n 1.Press s for sick leave\n 2.Press p for paid leave\n 3.Press c for casual leave");
        	char type_of_leave = br.readLine().charAt(0);
        	boolean r = pe.avail_leave(no_of_leaves, type_of_leave);
        	if(r==false)
        		System.out.println("Insufficient Leave Balance");
        	break;
        case 4:
        	pe.calculate_salary();
        	break;
        }
        System.out.println("Do you want to Continue\n enter y for Yes\n enter n for No");
        ch=br.readLine().charAt(0);
        }while(ch=='y');
        }
}


