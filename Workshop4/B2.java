class B2{
    public static void main(String[] args){
        int[] phy= {55,40,75,60,55,40};
        int sum=0;
        for (int i=0; i<=5;){
            sum= sum+(int)phy[i];
        }
        int avg= sum/phy.length;
        System.out.println("The avg is"+avg);
    }
}