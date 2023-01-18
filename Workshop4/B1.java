import java.util.*;
class B1{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number from 1-10 to know if its present:");
        int n= a.nextInt();
        List arr= new ArrayList();
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,6);
        arr.add(3,7);
        arr.add(4,9);
        arr.add(5,10);
        String aa="";
        for (int i=0;i<6;i++){
            if ((int)arr.get(i)==n){
                System.out.println(n+" is present.");
                break;
            }else if ((int)arr.get(i)!=n){
              //  System.out.println(n+" is not present.");
               aa="not present"; 
            }
       }
       System.out.println(aa);
    }
}