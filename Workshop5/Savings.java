import java.util.*;
public class Savings{
    int p;
    int t;
    int r;
    double SI;
    public static void main(String[] args){
        Savings x= new Savings();
        x.Interest();
    }
    public void Interest(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the principle");
        p = in.nextInt();
        System.out.print("Enter the time");
        t = in.nextInt();
        System.out.print("Enter the rate:");
        r = in.nextInt();
        SI=(p*t*r)/100;
        System.out.println("The simple interest is: "+SI);
    }
}