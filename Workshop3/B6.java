import java.util.Scanner;
public class B6 {
    public static void main(String[] args) {
        int num, countPositive = 0, countNegative = 0, countZero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number, enter 0 to exit: ");
        while ((num=sc.nextInt()) != 0) {
            if (num > 0)
                countPositive++;
            else if (num < 0)
                countNegative++;
            else
                countZero++;
        }
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }
}