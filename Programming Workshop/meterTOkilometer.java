import java.util.Scanner;
class meterTOkilometer{
public static void main(String[] args){
double v= 0;
Scanner in = new Scanner(System.in);
System.out.print("Enter the length in meters:");
int l = in.nextInt();
v= l/1000.0;
System.out.println("In kilometer is "+v+" "+"For "+l+"meter");
}
}