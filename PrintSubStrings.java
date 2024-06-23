public class PrintSubStrings{
    public static void main(String [] args){
        String str="pqrs";
        for(int i=0;i<str.length();i++){
            String temp="";
            temp=temp+str.charAt(i);
            System.out.println(temp);
            for(int j=i+1;j<str.length();j++){
                temp=temp+str.charAt(j);
                System.out.println(temp);

            }
        }
    }
}