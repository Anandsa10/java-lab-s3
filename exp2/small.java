import java.util.*;
class small
{
   public static void main(String args[])
   {
    int n,small;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=in.nextInt();
    int a[]=new int[n];
    System.out.print("Enter the array elements");
    for(int i=0;i<n;i++)
     {
      a[i]=in.nextInt();
      }
     small=a[0];
       for(int i=1;i<n;i++)
        {
          if(a[i]<small)
         {
          small=a[i];
          }
        }
       System.out.print("The smallest element is:"+small);
       }
 }
