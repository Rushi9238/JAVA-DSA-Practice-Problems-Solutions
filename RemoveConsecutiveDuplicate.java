public class RemoveConsecutiveDuplicate {
    public static void main(String args []){
        String str="aabbbcccccd";
        char lastChar=str.charAt(0);
        String result=""+lastChar;
        for(int i=1;i<str.length();i++){
            char currentChar=str.charAt(i);
            if(lastChar!=currentChar){
                result=result+currentChar;
                lastChar=currentChar;
            }
        }
        
        System.out.println(" @"+result);
    }
}
