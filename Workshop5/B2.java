public class B2{
    int length= 6;
    int width=4;
    public static void main(String[] args){
        B2 x= new B2();
        x.area();
        x.perimeter();
    }
    public void area(){
        int area= length*width;
        System.out.println("The area is "+area);
    }
    public void perimeter(){
        int perimeter= 2*(length+width);
        System.out.println("The perimeter is "+perimeter);
    }
}
