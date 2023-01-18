import java.util.*;
class list3{
    public static void main(String[] args){
        List ting= new ArrayList();
        ting.add(123);
        ting.add("Hello");
        ting.add(456.7);
        ting.add(2,"World!");//inserting an element inside a list in 2nd positional index
        System.out.println("List is"+ting);
    }
}