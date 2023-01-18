import java.util.Scanner;
class PEofbody{
public static void main(String[] args){
double g= 9.8, pe= 0;
Scanner in = new Scanner(System.in);
System.out.print("Enter the mass of the body:");
double m = in.nextInt();
System.out.print("Enter the height:");
double h = in.nextInt();
pe= m*g*h;
System.out.println("The PE of the body is "+pe);
}
}