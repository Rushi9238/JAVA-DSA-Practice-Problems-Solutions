public class Compress_the_String {
    public static void main(String args []){
        String str="aaabbccdsa";
        char lastChar=str.charAt(0);
        String result="";
        int count=1;
        for(int i=1;i<str.length();i++){
            char currentChar=str.charAt(i);
            if(currentChar==lastChar){
                count++;
            }
            else{
               result= compressResult(result,count,lastChar);
                count=1;
                lastChar=currentChar;
            }
        }
        result=compressResult(result,count,lastChar);
        System.err.println("result");
        System.out.println(result);
    }

    public static String compressResult(String result,int count,char lastChar){
        if(count>1){
            result=result+lastChar+count;
        }
        else{
           result=result+lastChar;
        }

        return result;
    }
}
