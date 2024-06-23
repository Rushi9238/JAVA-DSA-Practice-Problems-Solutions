package Pattens;

import java.util.Scanner;

public class DecendingOrder {
    // 1. Write a program that sorts an
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		for(int i=num;i>=1;i--){
            // System.out.println(i);
            for(int j=num;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
