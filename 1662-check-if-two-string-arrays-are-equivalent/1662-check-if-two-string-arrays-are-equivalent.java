class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            s1.append(word1[i]);
        }
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<word2.length;i++){
            s2.append(word2[i]);
        }
        
        if(s1.toString().equals(s2.toString())){
            return true;
        }
        return false;
    }
}