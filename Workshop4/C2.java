import java.util.*;
public class C2 {
 public static void main(String[] args){ 
         HashSet<String> s=new HashSet<>(); 
         s.add("aqua"); s.add("blue"); s.add("silver"); s.add("green"); s.add("purple"); 
         System.out.println("The first set is:"+s);
         HashSet<String> t=new HashSet(); 
         t.add("violet"); t.add("indigo"); t.add("blue"); t.add("green"); t.add("yellow"); t.add("orange"); t.add("red");
         System.out.println("The second set is:"+t); 
         s.retainAll(t); 
         System.out.println("The common elements are:"+s); 
 } 
}