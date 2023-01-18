import java.util.Scanner;
class b5{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Enter the last name:");
String last_name = in.next();
System.out.print("Enter the age:");
int age = in.nextInt();
System.out.print("Enter the temperature:");
float current_temperature = in.nextFloat();
System.out.println("The last name is "+last_name);
System.out.println("The age is "+age);
System.out.println("The current temperature is "+current_temperature);
}
}
    