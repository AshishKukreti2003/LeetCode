class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for(String str: words){
            int index = str.charAt(str.length () -1) - '0';
            result[index-1] = str.substring(0, str.length()-1);
        }
        return String.join(" ", result);
    }
} 