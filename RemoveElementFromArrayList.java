import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementFromArrayList
{
   public static void main(String[] args)
   {
      int a=0;
      String s1 = "";
      Scanner s = new Scanner(System.in);

        System.out.println("\tREMOVING ELEMENT From ARRAYLIST DEMO\n");

        System.out.print(" Enter Size of List\t:\t");
        a = s.nextInt();

        ArrayList<String> arr = new ArrayList<String>(a);

        System.out.println("\n Enter the Elements...\n");
      s.nextLine();

      for(int i=0; i < a; i++)
      {
            System.out.print(" " + (i+1) + ". ");
          s1 = s.nextLine();
          arr.add(s1);
      }

        System.out.println("\n The size of the list is :\t" + arr.size());

      int i=0;
        for (String name : arr)
        {
           System.out.print("\n " + (i+1) + ". "+ name);
           i++;
        }

      System.out.print("\n\n Enter no. of element to be removed\t:\t");

        a = s.nextInt();
        arr.remove(a-1);

        System.out.println("\n After element removed, size of List\t:\t" + arr.size());
        System.out.println("\n And the Altered List is...");

      i=0;
        for (String name : arr)
        {
           System.out.print("\n " + (i+1) + ". " + name);
           i++;
        }
        System.out.print("\n\n\n\n\n ");
     }
}
