import java.util.Scanner;
class askKmtoMiles{
public static void main(String[] args){
double v= 0;
Scanner in = new Scanner(System.in); 
System.out.print("Enter length in km");
int l = in.nextInt();
v= l*0.62;
System.out.println("The length in miles is "+v);
}
}