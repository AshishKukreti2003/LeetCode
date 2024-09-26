class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i+=2*k){
            int start = i, end = Math.min(start + k -1 , a.length-1);
            while(start<end){
                char ch = a[start];
                a[start++] = a[end];
                a[end--] = ch;
                
            }
        }
        return new String(a);
    }
}