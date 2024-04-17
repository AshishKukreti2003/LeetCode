class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = check(s.toLowerCase(), 0, s.length()/2);
        int count2 = check(s.toLowerCase(), s.length()/2, s.length());
        
        return count1 == count2;    
    }
    
    static int check(String s, int start, int end){
        int count = 0;
        for(int i=start;i<end;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}