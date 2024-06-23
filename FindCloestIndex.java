public class FindCloestIndex {
    public static void main(String args []){
        int arr[] = {1, 3, 7, 9, 11, 12, 45};
        int target = 6;
        int closestIndex = findClosestIndex(arr, target);
        System.out.println("Closest Index is: " + closestIndex);

    }
    public static int findClosestIndex(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }

        if(left>=arr.length){
            return right;
        }
        if(right<0){
            return left;
        }

        if(Math.abs(arr[left]-target)>Math.abs(arr[right]-target)){
            return left;
        }
        else{
            return right;
        }

        // return -1;
    }
}
