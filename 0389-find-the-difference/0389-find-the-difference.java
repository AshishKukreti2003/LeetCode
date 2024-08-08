class Solution {
    public char findTheDifference(String s, String t) {
        char[] sCharArray =  s.toCharArray();
        Arrays.sort(sCharArray);
        
        char[] tCharArray = t.toCharArray();
        Arrays.sort(tCharArray);
        
        for(int i=0;i<sCharArray.length;i++){
            if(sCharArray[i] != tCharArray[i])
                    return tCharArray[i];
        }
        return tCharArray[tCharArray.length-1];
    }
}