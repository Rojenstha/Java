import java.util.Scanner;
class b_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a = in.nextInt();
        System.out.print("Enter the 2nd number:");
        int b= in.nextInt();
        int c=1, i = 1;
        while (i<=b){
           c=c*a;
        }
        System.out.println("The output is"+c);
    }
}