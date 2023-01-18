import java.util.*;
public class C4{
    public static void main(String[] args){
    HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
    hash_map.put(1,"yellow");
    hash_map.put(2,"purple");
    hash_map.put(3,"black");
    hash_map.put(4,"blue");
    hash_map.put(5,"red");
    System.out.println("Collection view is: "+hash_map.values());
    }
}