import java.util.*;
class transpose
{
   public static void main(String args[])
   {
    int m,n;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements in row and column:");
    m=in.nextInt();
    n=in.nextInt();
    int a1[][]=new int[m][n];
    int a2[][]=new int[m][n];
    System.out.println("Enter the array elements of matrix");
      for(int i=0;i<m;i++)
        {
         for(int j=0;j<n;j++)
          {
           a1[i][j]=in.nextInt();
           }
         }
       System.out.println("Transpose of the matrix");
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
           {
           a2[i][j]=a1[j][i];
            }
        }
    System.out.println("Display the transposed matrix");
         for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
             {
           System.out.println(a2[i][j]);
            }
         }
    }
}
