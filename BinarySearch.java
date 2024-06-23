public class BinarySearch {
    public static void main(String args[]){
        int arr[]={1,3,7,9,11,12,45};

        int target=4;

        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println();
                System.out.println(mid);
                return ;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }
    
    }
}
