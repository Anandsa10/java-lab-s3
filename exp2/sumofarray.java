import java.util.*;
class sumofarray
{
   public static void main(String args[])
   {
    int n,sum=0;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=in.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
     {
      a[i]=in.nextInt();
      sum=sum+a[i];
      }
    System.out.print("The sum is:"+sum);
    }
}
