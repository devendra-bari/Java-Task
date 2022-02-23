import java.util.Scanner;

public class TransposeOfMatrix
{
	public static void main(String[] args)
	{
      int m, n, i, j;
      Scanner in = null;

      in = new Scanner(System.in);
      System.out.print(" To Find TRANSPOSE OF GIVEN MATRIX,\n\n");
      System.out.print(" Enter the number of rows of the matrix\t\t:\t");
      m = in.nextInt();
      System.out.print("\n Enter the number of columns of the matrix\t:\t");
      n = in.nextInt();

      int matrix[][] = new int[m][n];

      System.out.println("\n Enter the elements of the matrix :\n");
      for (i = 0; i < m; i++)
      {
        for (j = 0; j < n; j++)
        {
          matrix[i][j] = in.nextInt();
        }
      }

      int row , column;
      row = m;
      column = n;

          System.out.println("\n The Given matrix is : \n");
      display(matrix);

      int[][] transpose = new int[column][row];
      for(int x = 0; x < row; x++)
        for (int y = 0; y < column; y++)
          transpose[y][x] = matrix[x][y];

      System.out.println("\n The Transposed matrix is : \n");
      display(transpose);
      System.out.println("\n");
    }

	public static void display(int[][] matrix)
    {
        for(int[] row : matrix)
        {
            for (int column : row)
                System.out.print(column + "    ");
            System.out.println();
        }
        System.out.println("");
    }
}
