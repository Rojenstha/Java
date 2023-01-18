import java.util.Scanner;
class SIandTA{
public static void main(String[] args){
    double SI=0, TA=0;
Scanner in = new Scanner(System.in);
System.out.print("Enter the principal:");
int p= in.nextInt();
System.out.print("Enter the rate:");
double r= in.nextInt();
System.out.print("Enter the time:");
int t= in.nextInt();
SI= (p*t*r)/100.0;
TA= p*t*r;
System.out.println("SI is "+SI+" Total amount is"+TA);
}
}