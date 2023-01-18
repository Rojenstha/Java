import java.util.Scanner;
class c6buzznumber{
    public static void main(String[] args){
        System.out.println("Buzznumber:Number ending with 7, divisible by 7");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
         if(n % 10 == 7 || n % 7 == 0){
            System.out.println("The number is buzznumber.");
        }else{
            System.out.println("The number is not buzznumber.");
        }
    }
}