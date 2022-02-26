import java.util.*;
class secondlargest
{
   public static void main(String args[])
   {
    int n,max=0,secondmax=0;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=in.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
     {
      a[i]=in.nextInt();
       if(a[i]>max)
         {
          secondmax=max;
          max=a[i];
         }
           else if(a[i]<max&&a[i]>secondmax)
           {
            secondmax=a[i];
           }
       }
      System.out.print("The second largest element is:"+secondmax);
    }
 }
