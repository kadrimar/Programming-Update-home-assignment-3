import java.util.Scanner;

public class Assignment3_1 {
	public static void main (String[] args)
	{
int num;
	Scanner scan = new Scanner (System.in);
	System.out.print ("Please enter an integer: ");
	num = scan.nextInt();
	
	if (num > 0)
		System.out.println("This number is positive.");
	else
	System.out.println("This number is negative.");
	
	}
	

}
