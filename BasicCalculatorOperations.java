import java.io.DataInputStream;
import java.io.IOException;

class BasicCalculatorOperations
{
	public static void main(String args[])
	{
		int fno = 0, sno = 0;
		DataInputStream d1 = new DataInputStream(System.in);

		//Addition
		System.out.println(" \t-: FOR ADDITION OF 2 NUMBERS :-\n");
		System.out.println("=================================================\n");
		try
		{
			System.out.print(" Enter First no. \t:\t");
			fno = Integer.parseInt(d1.readLine());
			System.out.print(" Enter Second no. \t:\t");
			sno = Integer.parseInt(d1.readLine());
		}
		catch(IOException obj){}
		System.out.println("\n-------------------------------------------------");
		System.out.println("\n Sum of " + fno + " & " + sno + "\t\t=\t" + (fno + sno));
		System.out.println("\n=================================================\n");

		//Subtraction
		System.out.println(" \t-: FOR SUBTRACTION OF 2 NUMBERS :-\n");
		System.out.println("=================================================\n");
		try
		{
			System.out.print(" Enter First no. \t:\t");
			fno = Integer.parseInt(d1.readLine());
			System.out.print(" Enter Second no. \t:\t");
			sno = Integer.parseInt(d1.readLine());
		}
		catch(IOException obj){}
		System.out.println("\n-------------------------------------------------");
		System.out.println("\n Difference of " + fno + " & " + sno + "\t=\t" + (fno - sno));
		System.out.println("\n=================================================\n");

		//Multiplication
		System.out.println(" \t-: FOR MULTIPLICATION OF 2 NUMBERS :-\n");
		System.out.println("=================================================\n");
		try
		{
			System.out.print(" Enter First no. \t:\t");
			fno = Integer.parseInt(d1.readLine());
			System.out.print(" Enter Second no. \t:\t");
			sno = Integer.parseInt(d1.readLine());
		}
		catch(IOException obj){}
		System.out.println("\n-------------------------------------------------");
		System.out.println("\n Product of " + fno + " & " + sno + "\t=\t" + (fno * sno));
		System.out.println("\n=================================================\n");

		//Division
		System.out.println(" \t-: FOR DIVISION OF 2 NUMBERS :-\n");
		System.out.println("=================================================\n");
		try
		{
			System.out.print(" Enter First no. \t:\t");
			fno = Integer.parseInt(d1.readLine());
			System.out.print(" Enter Second no. \t:\t");
			sno = Integer.parseInt(d1.readLine());
		}
		catch(IOException obj){}
		System.out.println("\n-------------------------------------------------");
		System.out.println("\n Division of " + fno + " with " + sno + "\t=\t" + (fno / sno));
		System.out.println("\n=================================================\n\n");
	}
}
