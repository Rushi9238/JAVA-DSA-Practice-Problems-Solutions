// Write a program that asks the user for a number N and a choice C. And then 
// give them the possibility to choose between computing the sum and computing the
//  product of all integers in the range 1 to N (both inclusive).

// If C is equal to -
//  1, then print the sum
//  2, then print the product
//  Any other number, then print '-1' (without the quotes)



import java.util.Scanner;

public class SumorProduct {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int choies=sc.nextInt();
        int sum=0;
        int result=choies==1?0:choies==2?1:-1;
        // System.out.println(result);
        if(result==-1){
            System.out.println(result);
            sc.close();
            return;
        }else{
            if(choies==1){
                for(int i=1;i<=num;i++){
                    result=result+i;
                }
                System.out.println(result);
                sc.close();
                return;
            }
            else if(choies==2){
                for(int i=1;i<=num;i++){
                    result=result*i;
                }
                System.out.println(result);
                sc.close();
                return;
            }
        }
        
        
    }
}
