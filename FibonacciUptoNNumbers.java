import java.util.Scanner;

class FibonacciUptoNNumbers
{
	public static void main(String args[])
	{
		int fbc[] = new int [30] , i = 0, j, sum = 0 ;
		Scanner s1 = new Scanner(System.in);
		System.out.println("\n\t\t-: Fibonacci Series using Array :-");
		System.out.println("\n==============================================================\n");
		System.out.print(" How many numbers do you want ?\t:\t");
		j=s1.nextInt();

		System.out.print("\n--------------------------------------------------------------\n\n");

		fbc[0] = 0;
		fbc[1] = 1;

		for(i=2; i<j ; i++)
			fbc[i] = fbc[i-1] + fbc[i-2];

		for(i=0; i<j; i++)
			System.out.print("\t"+fbc[i]);

		System.out.print("\n\n==============================================================\n\n ");
	}
}
