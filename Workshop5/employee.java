import java.util.*;
public class employee{
    String name;
    int age;
    int phone_num;
    String Address;
    int salary;
    public static void main(String[] args){
        employee n= new employee();
        n.info();
        n.printSalary(10000);
    }
    public void info(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the name:");
        name = in.next();
        System.out.print("Enter the age:");
        age = in.nextInt();
        System.out.print("Enter the phone number:");
        phone_num = in.nextInt();
        System.out.print("Enter the Address:");
        Address = in.next();
        System.out.println("Name:"+name+"\nAge:"+age+"\nPhone num:"+phone_num+"\nAddress:"+Address);
    }
    public void printSalary(int salary){
        System.out.println("The salary is "+salary);
    }
}