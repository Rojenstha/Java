public class B1{
    public static void main(String[] args){
        student obj= new student();
        obj.roll_no=2;
        obj.name="John";
        System.out.println("Name;"+obj.name);
        System.out.println("Roll no."+obj.roll_no);
    }
}
class student{
    int roll_no;
    String name;
}