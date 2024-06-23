import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        String str="Hello everyone How are you";
        String [] temp=str.split(" ");
        String finalOut="";
        for(int i=0;i<temp.length;i++){
            finalOut=finalOut+reverseString(temp[i])+" ";
        }
        System.out.println(finalOut);
        
    
        
    }
    public static String reverseString(String str){
        String revString="";
        for(int i=str.length()-1;i>=0;i--){
            revString=revString+str.charAt(i);
        }
        return revString;
    }
}
