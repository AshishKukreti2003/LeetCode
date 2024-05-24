class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        if(word.charAt(0) == ch){
            return word;
        }
        int j= 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                j = i;
                break;
            }
        }
        for(int i = j;i>=0;i--){
            sb.append(word.charAt(i));
        }
        for(int i=j+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}