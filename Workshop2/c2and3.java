import java.util.Scanner;
class c2and3{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter a word:");
        String a = abc.next();
        System.out.printf("%15s \n",a);
        System.out.printf("%-15s",a);
    }
}