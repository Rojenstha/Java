import java.util.Scanner;
class sumoffirstnaturalnumber{
public static void main(String[] args){
int sum= 0;
Scanner in = new Scanner (System.in);
System.out.print("Enter the natural number:");
int n = in.nextInt();
sum= (n*(n+1))/2;
System.out.println("The output is "+sum);
}
}