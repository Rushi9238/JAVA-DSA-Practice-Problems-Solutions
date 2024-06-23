import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print(i +" ");
                isPrime=false;
                // break;
            }
        }
        if(isPrime){
            // System.out.println();
            System.out.println(-1);
        }
    
    }
}
