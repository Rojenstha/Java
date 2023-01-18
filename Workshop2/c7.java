import java.util.Scanner;
class c7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age:");
        int a = in.nextInt();
        if (a<=13){
            System.out.println("You are a child.");
        }else if(a<=45){
            System.out.println("You are an adult.");
        }else if(a>45){
            System.out.println("You are a senior.");
        }
    
    }
}