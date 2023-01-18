import java.util.Scanner;
class C1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number from 100-200 to run, any other to end:");
        int num = in.nextInt();
        int sum=0;
        while (num >=100){
            sum= sum+num;
            System.out.println("Enter number from 100-200 to run, any other to end:");
            num=in.nextInt();
        }
        System.out.println("The sum of numbers= " +sum);
    }
}