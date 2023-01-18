import java.util.*;
class d1{
    public static void main(String[] args){
        System.out.println("Chart of price to print the number of copies:");
        System.out.println("For 0 – 99 : $0.30 per copy, For 100 – 499 : $0.28 per copy, For 500 – 799 : $0.27 per copy,For 800 – 1000 : $0.26 per copy & For Over 1000 : $0.25 per copy");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of copies to print:");
        int copy= in.nextInt();
        if (copy<=99){
            System.out.println("The cost is $"+(copy*0.30));
        }else if (copy<=499){
            System.out.println("The cost is $"+(copy*0.28));
        }else if (copy<=799){
            System.out.println("The cost is $"+(copy*0.27));
        }else if (copy<=1000){
            System.out.println("The cost is $"+(copy*0.26));
        }else if (copy>1000){
            System.out.println("The cost is $"+(copy*0.25));
        }
    }
}