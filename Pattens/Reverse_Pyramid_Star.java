public class Reverse_Pyramid_Star {
    public static void main(String[] args) {
        int num=5;
        for(int i=num;i>=1;i--){
            for(int j=1;j<=num-i;j++){
                System.err.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
