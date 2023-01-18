import java.util.Scanner;
class c4{
    public static void main(String[] args){
        double p=0, g=0, m=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st Subject:");
        float a= in.nextFloat();
        System.out.print("Enter the 2nd Subject:");
        float b= in.nextFloat();
        System.out.print("Enter the 3rd Subject:");
        float c= in.nextFloat();
        System.out.print("Enter the 4th Subject:");
        float d= in.nextFloat();
        System.out.print("Enter the 5th Subject:");
        float e= in.nextFloat();
        m= a+b+c+d+e;
        p= (m/500.0)*100.0;
        g= (p/100.0)*4;
        System.out.println("The total marks is "+m+". "+"The percentage is "+p+". "+"The grade is "+g+".");
    }
}