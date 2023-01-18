import java.util.Scanner;
class passorfail{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the marks:");
        int a = in.nextInt();
        if (a>=40){
            System.out.println("You are pass.");
        }else{
            System.out.println("You are fail.");
        }
    }
}