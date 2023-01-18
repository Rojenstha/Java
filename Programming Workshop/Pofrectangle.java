import java.util.Scanner;
class Pofrectangle{
public static void main(String[] args){
int P=0;
    Scanner in = new Scanner(System.in);
System.out.print("Enter the length:");
    int l= in.nextInt();
System.out.print("Enter the width:");
    int w= in.nextInt();
    P=2*(l+w);
System.out.println("The perimeter of rectangle is "+P);
}
}