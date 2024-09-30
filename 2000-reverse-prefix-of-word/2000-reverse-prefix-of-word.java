class Solution {
    public String reversePrefix(String word, char ch) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                return reverse(word,i);
            }
        }
        return word;
    }
    
    public static String reverse(String word, int i){
        StringBuilder sb1 = new StringBuilder(word.substring(0,i+1));
        String sb2 = word.substring(i+1,word.length());
        // StringBuilder sb2 = new StringBuilder(word.substring(i+1,word.length()));
        
        return sb1.reverse().append(sb2).toString();
    }
}