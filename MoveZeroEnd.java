public class MoveZeroEnd {
    public static void main(String[] args) {
        int arr[]={4,3,2};
        int zero=0;
        int non_zero=0;
        while(zero<arr.length ){
            if(arr[zero]==0){
                zero++;
            }else{
                int temp=arr[zero];
                arr[zero]=arr[non_zero];
                arr[non_zero]=temp;
                non_zero++;
                zero++;

            }
           
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
