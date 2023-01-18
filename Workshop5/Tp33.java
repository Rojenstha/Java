class Tp33{
    public static void main(String[] args){
      checkAge A= new checkAge();
      if(A.a>=18){
          System.out.println("Access granted.");
      }else{
          System.out.println("Access denied.");
      }
    }
}
class checkAge{
    int a= 20;
}