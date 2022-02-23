import java.util.Scanner;

public class PermutationCombinationOfGiven2No
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int n, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\t PERMUTATION COMBINATION PROGRAM\n");
 	System.out.println("\n==============================================================\n");

        System.out.print("\t\tEnter Value of n : ");
        n = scanner.nextInt();
        System.out.print("\t\tEnter Value of r : ");
        r = scanner.nextInt();
	System.out.println("\n==============================================================\n");

        System.out.print("\t\t\tNCR is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\n\t\t\tNPR is " +(fact(n)/(fact(n-r))));
      	System.out.println("\n==============================================================\n");

    }
}
