class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=0, res=0;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i=0;i<m;i++){
            res =0;
            for(int j=0;j<n;j++){
                res+=accounts[i][j];
            }
            result = Math.max(res,result);
        }
        
        return result;
    }
}