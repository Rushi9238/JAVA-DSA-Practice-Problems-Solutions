package Pattens;

import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        // int num=123;

        int reverse_num=0;
        while (num>0) {
         int digit=num%10;
         reverse_num=reverse_num*10+digit; 
         num=num/10;
            
        }
        System.out.println(reverse_num);
        


    }
}