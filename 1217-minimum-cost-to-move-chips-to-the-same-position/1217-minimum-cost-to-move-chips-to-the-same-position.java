class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0, oddCount = 0;
        for(int num: position){
            if(num%2 == 0) evenCount++;
            else oddCount++;
        }
        
        return (oddCount <= evenCount) ? oddCount : evenCount;
    }
}