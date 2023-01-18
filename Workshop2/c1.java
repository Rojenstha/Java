import java.util.Scanner;
class c1{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the no. to find positive or negative:");
    int n = in.nextInt();
    if (n<0){
        System.out.println("The number is negative.");
    }else {
        System.out.println("The number is positive.");
    }
    }
}