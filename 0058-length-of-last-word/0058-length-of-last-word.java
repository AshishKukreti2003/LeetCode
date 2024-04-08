class Solution {
    public int lengthOfLastWord(String s) {
        String new_s = s.trim();
        int count = 0;
        for(int i=new_s.length()-1;i>=0;i--){
            if(new_s.charAt(i) != ' ')
                count++;
            
            else
                break;
            
        }
        
        return count;
        
    }
}