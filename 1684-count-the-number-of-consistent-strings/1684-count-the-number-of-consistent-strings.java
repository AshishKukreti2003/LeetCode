class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String word : words){
            boolean istrue = true;
            for(char ch: word.toCharArray()){
                boolean found = false;
                for(char c: allowed.toCharArray()){
                    if(ch == c){
                        found = true;
                        // break;
                    }
                }
                if(!found){
                    istrue = false;
                    // break;
                }
            }
            if(istrue){
                count++;
            }
        }
        return count;
    }
}