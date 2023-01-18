import java.util.Scanner;
class looptwo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number, or 0 to stop:");
        int num = in.nextInt();
        int sum=0;
        while (num !=0){
            sum= sum+num;
            System.out.println("Enter another number or 0 to stop:");
            num=in.nextInt();
        }
        System.out.println("The sum of numbers= " +sum);
    }
}