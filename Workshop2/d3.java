import java.util.Scanner;
class d3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time in seconds:");
        int ts= in.nextInt();
        int tm=ts/60;
        int sec=ts%60;
        int hr= tm/60;
        int min= tm%60;
        System.out.println(hr+"hr"+min+"min"+sec+"sec");
    }
}