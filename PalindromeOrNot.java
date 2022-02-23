import java.io.DataInputStream;
import java.io.IOException;

class PalindromeOrNot
{
	public static void main(String args[])
	{
		int num = 0, bkup , rev = 0;
		DataInputStream d1 = new DataInputStream(System.in);
		System.out.println("\n\t\t-: PALINDROME OR NOT :-");
		System.out.println("\n==============================================================");
		System.out.println("\n To Check if Given number is Palindrome or not...");

		try
		{
			System.out.print("\n Enter any number\t\t->\t");
			num = Integer.parseInt(d1.readLine());
		}
		catch(IOException obj){}

		System.out.print("\n--------------------------------------------------------------\n\n ");

		bkup=num;
		while(num != 0)
		{
			rev=rev*10 + (num%10);
			num=num/10;
		}

		if(bkup==rev)
			System.out.print("\t\t==> " + bkup + " is a Palindrome Number");
		else
			System.out.print("\t\t==> " + bkup + " is not a Palindrome Number");

		System.out.print("\n\n==============================================================\n\n ");

	}
}
