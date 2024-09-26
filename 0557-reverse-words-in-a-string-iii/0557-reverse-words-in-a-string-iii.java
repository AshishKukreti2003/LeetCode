class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        for(int i=0;i<a.length;i++){
            a[i] = reversee(a[i]);
        }
        return String.join(" ", a);
    }
    
    static String reversee(String a){
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString();
    }
}