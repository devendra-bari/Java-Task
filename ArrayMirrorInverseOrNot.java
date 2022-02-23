import java.util.Scanner;

class ArrayMirrorInverseOrNot
{
    static boolean isMirrInv(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {

            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int arr[] = new int [5];
        System.out.println("\n To check whether Given Array is MIRROR INVERSE Or NOT...");
        System.out.println("\n Out of 5 numbers,");

        Scanner scn = new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
          System.out.print("\n Enter " + (i+1) + "th number\t\t->\t");
          arr[i] = scn.nextInt();
        }

        if (isMirrInv(arr))
                System.out.println("\n\n ==>\tGiven Array is Mirror Inverse!!\n\n");
            else
                System.out.println("\n\n ==>\tGiven Array is NOT Mirror Inverse!!\n\n");
        }
}
