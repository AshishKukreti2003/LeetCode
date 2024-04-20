class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1){
            return true;
        }
        for(int i=1;i<=Math.sqrt(num);i++){
            if(Math.sqrt(num) == i){
                return true;
            }
        }
        return false;
    }
}