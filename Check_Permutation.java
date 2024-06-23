public class Check_Permutation {
    public static void main(String args []){
        String str1="abcde";
        String str2="baedc";
        System.out.println(checkPermutation(str1,str2));

    }

    public static boolean checkPermutation(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int freq1 []=new int [26];
        int freq2 []=new int [26];
        for(int i=0;i<str1.length();i++){
            char currentCha1=str1.charAt(i);
            char currentChar2=str2.charAt(i);
            freq1[currentCha1-'a']++;
            freq2[currentChar2-'a']++;
        }
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }

        return true;
    }
}
