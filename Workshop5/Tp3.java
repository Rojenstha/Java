public class Tp3{
  public static void checkAge(int age){
        if(age>18){
            System.out.println("Access granted.");
        }
        else{
            System.out.println("Access denied.");
        }
  }
   public static void main(String[] args){
        checkAge(20);
  }
}

