import java.util.*;
class trace
{
   public static void main(String args[])
   {
    int m,n;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements in row and column:");
    m=in.nextInt();
    n=in.nextInt();
    int a1[][]=new int[m][n];
    System.out.println("Enter the array elements of first matrix");
         for(int i=0;i<m;i++)
        {
         for(int j=0;j<n;j++)
          {
           a1[i][j]=in.nextInt();
           }
         }
    int sum=0;
        for(int i=0;i<m;i++)               
        {
         sum+=a1[i][i];
         }     
        System.out.println("Trace of the matrix:"+sum);
     }
}
