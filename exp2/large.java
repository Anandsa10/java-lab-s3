import java.util.*;
class large
{
   public static void main(String args[])
   {
    int num,larg=0,m,n;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements in row and column:");
    m=in.nextInt();
    n=in.nextInt();
    int a[][]=new int[m][n];
    System.out.println("Enter the array elements");
    for(int i=0;i<m;i++)
     {
       for(int j=0;j<n;j++)
        {
      a[i][j]=in.nextInt();
       if(a[i][j]>larg)
         {
          larg=a[i][j];
          }
         }
     }
    System.out.print("The largest element is="+larg);
   }
}
