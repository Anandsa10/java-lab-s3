import java.util.*;
class palindrome
{
     public static void main(String args[])
    {
      Scanner in= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=in.nextInt();
      int k=0;
      n=k;
      int d,rev=0;
          while(n!=0)
          {
           d=n%10;
           rev=(rev*10)+d;
           n=n/10;
          }
             if(k==rev)
            {
           System.out.println("The number is palindrome");
            }
              else
             {
            System.out.println("The number is not palindrome");
             }

     }
}
