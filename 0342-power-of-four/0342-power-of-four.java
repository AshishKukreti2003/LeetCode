class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<n;i++){
            if(Math.pow(4,i) == n){
                return true;
            }else if(Math.pow(4,i) > n){
                return false;
            }
        }
        return false;
    }
}