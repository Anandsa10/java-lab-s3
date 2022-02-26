import java.util.*;
class add
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
    System.out.println("Enter the array elements of first matrix");
      for(int i=0;i<m;i++)
        {
         for(int j=0;j<n;j++)
          {
           a1[i][j]=in.nextInt();
           }
         }
       System.out.println("Enter the array elements of second matrix");
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
           {
           a2[i][j]=in.nextInt();
            }
        }
       System.out.println("Add the two matrices");
        int sum[][]=new int[m][n];
          for(int i=0;i<m;i++)
        {
         for(int j=0;j<n;j++)
          {
           sum[i][j]=a1[i][j]+a2[i][j];
           }
         }   
         System.out.println("The added matrix is");
            for(int i=0;i<m;i++)
             {
              for(int j=0;j<n;j++)
              {
             System.out.println(sum[i][j]);
              }
             }
      }
 }
