import java.util.*;
class particularelement
{
   public static void main(String args[])
   {
    int n;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=in.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
     {  
       a[i]=in.nextInt();
     }
     System.out.println("Before update"+a[2]);
      a[2]=9;
   System.out.println("After update"+a[2]);   
   }
}
