import java.util.*;
 class sumscan
 {
       public static void main(String args[])
       {
         Scanner in= new Scanner(System.in);
         System.out.println("Enter the number");
         int n=in.nextInt();
         int sum3=0;
         System.out.println("Sum of first"+n+"=");
            for(int i=1;i<=10;i++)
               {
                sum3=sum3+i;
                 }
        System.out.println(sum3);
       }
 }
