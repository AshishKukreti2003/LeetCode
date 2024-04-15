class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 1; i < numbers.length; i++){
            for(int j = i + 1; j <= numbers.length; j++){
                if(numbers[i - 1] + numbers[j - 1] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
