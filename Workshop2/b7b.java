import java.util.Scanner;
class b7b{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a,b or c:");
        String R = in.next();
        if(R=="a"){
            System.out.print("Apple");
        }
        if(R=="b"){
            System.out.print("Ball");
        }
        if(R=="c"){
            System.out.print("Coconut");
        }
    }
}