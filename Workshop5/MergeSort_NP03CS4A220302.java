import java.util.*;
public class MergeSort_NP03CS4A220302 {
    
    ArrayList<Integer> getInput(ArrayList<Integer> obj) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the numbers of element to add in array:");
        int n= in.nextInt();
        for (int i=0; i<n; i++){
            obj.add(in.nextInt());
                }
                return obj;
    }
    
        void getOutput(ArrayList<Integer> obj) {    
            System.out.println("The sorted array is "+obj);
                }
                
    void merge(ArrayList<Integer> obj, int x, int y, int z) {
             int i = x, j = y + 1;
        ArrayList<Integer> merged = new ArrayList<>();
        while (i <= y && j <= z) {
            if (obj.get(i) < obj.get(j)) {
                merged.add(obj.get(i));i++;
              } else {
                  merged.add(obj.get(j));j++;
              }
              }
              while (i <= y){
                  merged.add(obj.get(i));i++;
              }
              while (j <= z){
                  merged.add(obj.get(j));j++;
              }
                for (int k = 0; k < merged.size(); k++) {
                    obj.set(x + k, merged.get(k));
              }
    }
    
      void sort(ArrayList<Integer> obj, int x, int z) {
        if (x < z) {
            int y = (x + z) / 2;
            sort(obj, x, y);
            sort(obj, y + 1, z);
            merge(obj, x, y, z);
           }
     }
    
    public static void main(){
        MergeSort_NP03CS4A220302 mergeSort = new MergeSort_NP03CS4A220302();
       ArrayList<Integer> obj = new ArrayList<>();
       obj = mergeSort.getInput(obj);
       mergeSort.sort(obj, 0, obj.size() - 1);
       mergeSort.getOutput(obj);        
        }
    }