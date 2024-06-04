class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    sum+=Math.abs(i-j);
                }
            }
        }
        return sum;
    }
}