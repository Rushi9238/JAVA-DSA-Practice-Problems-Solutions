public class OccuringCharacter {
    public static void main(String args []){
        String str="acccbbaba    ";
       str= str.trim();
        int maxCount=0;
        char maxChar=str.charAt(0);
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;

                }
                if(maxCount<count){
                    maxCount=count;
                    maxChar=str.charAt(i);
                }
                
            }
        }
        System.out.println("max count "+maxChar+" is: "+maxCount);
    }
}
