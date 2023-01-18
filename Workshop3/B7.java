import java.util.Scanner; 
  class B7{ 
      public static void main(String[] args)
      { Scanner s=new Scanner(System.in); 
          System.out.println("Enter the number n"); 
          int a=s.nextInt(); int n1=0,n2=1,n3; System.out.println(n1+"\n"+n2); 
          for(int i=2;i<=a;i++){ n3=n1+n2; System.out.println(n3); n1=n2; n2=n3; 
            }
        }
    }