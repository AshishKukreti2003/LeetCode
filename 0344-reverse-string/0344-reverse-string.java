class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int ed = s.length-1;
        while(st<=ed){
            swap(s,st,ed);
            st++;
            ed--;
        }
    }
    
    private static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}