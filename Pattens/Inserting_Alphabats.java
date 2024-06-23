package Pattens;

import java.util.Scanner;

public class Inserting_Alphabats {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    // for(int i=num+65-1;i>=65;i--){
    //     for(int j=i;j<=i;j++){
    //         char ch=(char) j;
    //         System.out.print(ch);
    //     }
    //     System.out.println();
    // }
    for(int i=num+65-1;i>=65;i--){
        // System.out.println(i);
        for(int j=i;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
