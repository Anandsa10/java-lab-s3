import java.util.Scanner;

class student {
    int roll;
    String name;
    int marks[]=new int[7];
    Scanner onj=new Scanner(System.in);
    void writestudentlist(){
        System.out.println("enter the roll no");
        roll=onj.nextInt();
        
System.out.println("enter the name");
    name=onj.next();
    System.out.println("enter the marks of five subjects");

for(int i=1;i<=5;i++){
    System.out.print("enter the mark of "+i+"subject");
    marks[i]=onj.nextInt(); 
    }
    System.out.println(" the roll no is"+roll+"\n");
        
System.out.println(" the name is"+name+"\n");
    
System.out.println(" the marks of five subject\n");
for(int i=1;i<=5;i++){
    System.out.print(" the mark of "+i+"student is"+marks[i]+"\n");
    
    }
}
public static void main(String args[]) {
    
student obj=new student();
obj.writestudentlist();
}
}
