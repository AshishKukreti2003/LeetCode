/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let ans = 0;
    for(let i=0;i<accounts.length;i++){
        let sum = 0;
        for(let j=0;j<accounts[0].length;j++){
            sum+=accounts[i][j];
        }
        ans = Math.max(sum,ans);
    }
    return ans;
};