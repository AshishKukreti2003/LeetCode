class Solution {
    public int thirdMax(int[] nums) {
        long n1 = Long.MIN_VALUE, n2 = Long.MIN_VALUE, n3 = Long.MIN_VALUE;
        for(int i:nums){
            if(i>n1){
                n3 = n2;
                n2 = n1;
                n1 = i;
            }else if(i > n2 && i< n1){
                n3 = n2;
                n2 = i;
            }else if(i> n3 && i<n2){
                n3 = i;
            }
        }
        
        return (n3 == Long.MIN_VALUE) ? (int) n1: (int) n3;
    }
}