public class PrefixSum {
    public static void main(String args []){
        int [] arr={1,2,3,4,5};
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
