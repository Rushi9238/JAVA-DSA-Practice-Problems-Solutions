package Pattens;

public class RotatePattern {
    public static void main(String[] args) {
        int num=3;
        for(int i=1;i<=num;i++){
            for(int j=i;j<=num;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
