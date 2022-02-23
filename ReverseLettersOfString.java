import java.util.Scanner;

class ReverseLettersOfString
{
    public static void main (String[] args)
    {
        String str= "", rev ="";
        char ch;

        Scanner scn = new Scanner(System.in);

        System.out.print("To generate REVERSE OF A STRING,\n\n\n" );
        System.out.print("Enter the String\t:\t" );
        str = scn.nextLine();

        for (int i=0; i<str.length(); i++)
        {
          ch= str.charAt(i);
          rev= ch+rev;
        }
      
        System.out.println("\nReversed String is\t:\t" + rev);
        System.out.println("\n" );
    }
}
