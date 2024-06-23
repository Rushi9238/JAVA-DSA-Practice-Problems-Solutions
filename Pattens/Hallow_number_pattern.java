public class Hallow_number_pattern {
    public static void main(String[] args) {
        int num=4;
        for(int i=1;i<=num;i++){
            if(i==1 || i==num){
                for(int j=1;j<=num;j++){
                    System.out.print(j+" ");
                }
                System.out.println();

            }else{
                for(int j=1;j<=num;j++){
                    if(j==1){
                        System.out.print("1 ");
                    }
                    else if(j==num){
                        System.out.print("2 ");
                    }else{

                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            
        }
    }
}
