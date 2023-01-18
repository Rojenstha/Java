public class C2{
    public static void main(String[] args){
        double avg= Average(4.0, 6.0, 9.0);
        System.out.println("The average is "+avg);
    }
    public static double Average(double a, double b, double c){
        return (a+b+c)/3;
    }
}