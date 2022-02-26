import java.util.Scanner;
class Employee {
    int empno;
    String name;
    float phone;
}
class employee1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter How many employee:");
        int k = sc.nextInt();
        Employee emp[] = new Employee[k];
        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();
            System.out.println("Enter " + (i + 1) + " Employee data :");
            System.out.print("Enter employee empno :");
            emp[i].empno = sc.nextInt();
            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee phone :");
            emp[i].phone = sc.nextFloat();
        }
        System.out.println("\n\n============ All employee details are :============\n");
        for (int i = 0; i < k; i++) {
            System.out.println("Employee id  name and phone :" + emp[i].empno + " " + emp[i].name + " " + emp[i].phone);
        }
    }
}
