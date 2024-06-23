public class CheckArrayRotation {
    public static void main(String[] args) {
        int [] arr={5,6,1,2,3,4};
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            if(arr[low]<=arr[high]){
                System.out.println(low);
                return;
            }
            int mid=low+(high-low)/2;
            int next=(mid+1)%arr.length;
            int prev=(mid-1+arr.length)%arr.length;

            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
                System.out.println(mid);
            }
        }
    }
}
