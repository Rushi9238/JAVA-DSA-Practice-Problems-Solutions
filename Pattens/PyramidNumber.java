package Pattens;

public class PyramidNumber {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++) {
            for(int j=1;j<=3-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
