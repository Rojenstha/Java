import java.util.*;
public class MergeSort_NP03CS4A220302 {
    
    ArrayList<Integer> getInput(ArrayList<Integer> al) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the numbers of element to add in array:");
        int n= in.nextInt();
        for (int i=0; i<n; i++){
            al.add(in.nextInt());
                }
                return al;
    }
    
        void getOutput(ArrayList<Integer> al) {    
            System.out.println("The sorted array is "+al);
                }
                
    void merge(ArrayList<Integer> al, int beg, int mid, int end) {
             int i = beg, j = mid + 1;
        ArrayList<Integer> merged = new ArrayList<>();
        while (i <= mid && j <= end) {
            if (al.get(i) < al.get(j)) {
                merged.add(al.get(i));i++;
              } else {
                  merged.add(al.get(j));j++;
              }
              }
              while (i <= mid){
                  merged.add(al.get(i));i++;
              }
              while (j <= end){
                  merged.add(al.get(j));j++;
              }
                for (int k = 0; k < merged.size(); k++) {
                    al.set(beg + k, merged.get(k));
              }
    }
    
      void sort(ArrayList<Integer> al, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(al, beg, mid);
            sort(al, mid + 1, end);
            merge(al, beg, mid, end);
           }
     }
    
    public static void main(){
        MergeSort_NP03CS4A220302 mergeSort = new MergeSort_NP03CS4A220302();
       ArrayList<Integer> al = new ArrayList<>();
       al = mergeSort.getInput(al);
       mergeSort.sort(al, 0, al.size() - 1);
       mergeSort.getOutput(al);        
        }
    }