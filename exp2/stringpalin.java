import java.util.*;
class stringpalin
{
   public static void main(String args[])
   {
    String a,b="";
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the string");
    a=in.nextLine();
    int n=a.length();
       for(int i=n-1;i>=0;i--)
       {
        b=b+a.charAt(i);
        }
       if(b.equals(a))
      {
    System.out.println("palindrome");
      }
    else
    {
    System.out.println("not palindrome");   
     }
  }
}
