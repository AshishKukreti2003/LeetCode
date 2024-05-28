class Solution {
    public int findGCD(int[] nums) {
        int Max = nums[0];
        int Min = nums[0];
        for(int i=0;i<nums.length;i++){
            Max = Math.max(Max,nums[i]);
            Min = Math.min(Min,nums[i]);
        }
        return gcd(Min,Max);
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}