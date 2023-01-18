import java.util.Scanner;
class B4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = in.nextInt();
        int factor=1 ,i=1;
        while(i<=number){
            factor=factor*i;
            i++;
        }
        System.out.println(factor);
    }
}