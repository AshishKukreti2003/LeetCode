class Solution {
    public int findTheWinner(int n, int k) {
        return helper(n,k)+1;
    }
    
    static int helper(int n, int k){
        if(n == 1){
            return 0;
        }
        return (helper(n-1,k)+k)%n;
    }
}