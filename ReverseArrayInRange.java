import java.util.Scanner;

public class ReverseArrayInRange {
    
    public static void main(String[] args) {
    //    int langth_of_arr=takeInput("Enter length of Array");
    //    int start_from=takeInput("Enter the Start point");
    //    int end_to=takeInput("Enter the end point");
    //    int arr[]=new int[langth_of_arr];
    //    System.out.println("Enter the Array elements");
    //    for(int i=0;i<arr.length;i++){
    //     arr[i]=takeInput("Enetr the array of "+i+"th element");
    //    }
    //    for(int i:arr){
    //     System.out.print(i+" ");
    //    }
    int arr[]={1,2,3,4,5,6};
    int l=0;
    int r=3;
    while(l<r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
    }
    for(int i:arr){
        System.out.print(i+" ");
    }

    }

    public static int takeInput(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        int num=scanner.nextInt();
        return num;
    }
}
