import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x= s.nextInt();
		int y=s.nextInt();
		int Sum = x-(-y);
		System.out.println("Sum is " +Sum);	
	}

}
