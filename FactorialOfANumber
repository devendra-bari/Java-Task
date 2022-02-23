import java.io.DataInputStream;
import java.io.IOException;

class FactorialOfANumber
{
	public static void main(String args[])
	{
		int num = 0, bkup, fact = 1;
		DataInputStream d1 = new DataInputStream(System.in);
		System.out.println("\n\t\t-: FACTORIAL OF GIVEN NUMBER :-");
		System.out.println("\n==============================================================\n");
		System.out.println(" To get Factorial of given number :-");

		try
		{
			System.out.print("\n Enter any Number\t\t:\t ");
			num = Integer.parseInt(d1.readLine());
		}
		catch(IOException obj){}

		System.out.println("\n--------------------------------------------------------------\n");

		bkup=num;
		while(num != 0)
		{
			fact=fact * num;
			num=num-1;
		}
		System.out.println("\t==>\tFactorial of "+ bkup +" is " + fact);
		System.out.print("\n==============================================================\n\n ");
	}
}
