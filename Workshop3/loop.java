import java.util.Scanner;
class loop{
    public static void main(String[] args){
        int sum = 0 ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= in.nextInt();
        while (num >=0){
            sum+= num;
            System.out.println("Enter a number:");
            num = in.nextInt();
        }
        System.out.println("Sum = "+sum);
        in.close();
    }
}