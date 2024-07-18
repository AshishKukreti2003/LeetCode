class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans = subSet(nums);
        int sum = 0;
        for(List<Integer> innerlist:ans){
            int xor = 0;
            for(int num: innerlist){
                xor^=num;
            }
            sum+=xor;
        }
        return sum;
    }
    
    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}