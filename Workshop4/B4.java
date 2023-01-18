import java.util.*;
class B4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = in.nextInt(); 
        System.out.print("Enter 2nd number:");
        int b = in.nextInt();
        System.out.print("Enter 3rd number:");
        int c = in.nextInt();
        System.out.print("Enter 4th number:");
        int d = in.nextInt();
        int great=0;
        int[] arr={a,b,c,d};
        for(int i= 0;i<arr.length;i++){
            if (arr[0]>arr[i]){
               great=arr[0]; 
            }
            if(arr[1]>arr[i]){
                great=arr[1];
            }
            if(arr[2]>arr[i]){
                great=arr[2];
            }
            if(arr[3]>arr[i]){
                great=arr[3];
            }
      }
    if(great!=0)
        System.out.println("the greatest value is"+great);
    else
        System.out.println("cannot find");
    }
}