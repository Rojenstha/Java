import java.util.Scanner;
class kgTOg{
public static void main(String[] args){
    double kg = 0;
Scanner in = new Scanner(System.in);
System.out.print("Enter the weight in kg:");
double g = in.nextDouble();
kg= g*1000.0;
System.out.println("The output is "+kg);
}
}