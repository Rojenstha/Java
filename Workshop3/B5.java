import java.util.Scanner;
class B5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int base = in.nextInt();
        System.out.print("Enter the 2nd number:");
        int power= in.nextInt();
        int out=1, i = 1;
        while (i<=power){
           out=out*base;
           i++;
        }
                System.out.println("The output is"+out);
    }
}