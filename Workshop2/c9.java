import java.util.Scanner;
class c9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size no. from 1-10:");
        int size = in.nextInt();
        switch(size){
            case 1:
            System.out.println("It is unavailable.");    
                break;
            case 2:
            System.out.println("It is unavailable.");    
                break;
            case 7:
            System.out.println("It is unavailable.");    
                break;
            case 9:
                System.out.println("It is unavailable.");
                break;
            default:
            System.out.println("It is available.");    
                break;
        }
    }
}