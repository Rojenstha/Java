import java.util.Scanner;
class B3{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1; i<=10;){
            System.out.println(n+"*"+i+"="+(n*i));
            i+=1;
        }
    }
}