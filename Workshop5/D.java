import java.util.*;
public class D{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter 0 to end and any other number to proceed:");
        int w= in.nextInt();
        int i;
        if(w==0){
        System.out.println("Thanks for using it.");
        }
        while(w!=0){
        System.out.print("Enter 1 for addition, 2 for substraction, 3 for multiplication, and 4 for division:");
        int c= in.nextInt();
        D cal= new D();
        if (c==1){
            cal.addition();
        }if (c==2){
            cal.substraction();
        }if (c==3){
            cal.multiplication();
        }if (c==4){
            cal.division();
        }
      }
    }
    
    void addition(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a= in.nextInt();
        System.out.print("Enter 2nd number:");
        int b= in.nextInt();
        int sum = a+b;
        System.out.println("Your output is "+sum);
    }
    void substraction(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a= in.nextInt();
        System.out.print("Enter 2nd number:");
        int b= in.nextInt();
        int sub = a-b;
        System.out.println("Your output is"+sub);
    }
    void multiplication(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a= in.nextInt();
        System.out.print("Enter 2nd number:");
        int b= in.nextInt();
        int mul=a*b;
        System.out.println("Your output is"+mul);
    }
    void division(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a= in.nextInt();
        System.out.print("Enter 2nd number:");
        int b= in.nextInt();
        int div=a/b;
        System.out.println("Your output is"+div);
    }
}