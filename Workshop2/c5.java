import java.util.Scanner;
class c5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        float a = in.nextInt();
        System.out.print("Enter the 2nd number:");
        float b = in.nextInt();
        System.out.println("Addition:"+a+"+"+b+"="+(a+b));
        System.out.println("Substraction:"+a+"-"+b+"="+(a-b));
        System.out.println("Multiplication:"+a+"*"+b+"="+(a*b));
        System.out.println("Division:"+a+"/"+b+"="+(a/b));
        System.out.println("Modulus:"+a+"%"+b+"="+(a%b));
        System.out.println("Exponential:"+a+"**"+b+"="+(Math.exp(a)*Math.exp(b)));
    }
}