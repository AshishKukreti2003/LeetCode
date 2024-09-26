class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int i=0;
            while(i<haystack.length()){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}