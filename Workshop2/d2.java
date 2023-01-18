import java.util.*;
class d2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the floor:");
        int floor= in.nextInt();
        int af;
        if (floor>13){
            af=floor-1;
        }else{
            af=floor;
        }
        System.out.println("The actual floor to travel is "+af);
    }
}