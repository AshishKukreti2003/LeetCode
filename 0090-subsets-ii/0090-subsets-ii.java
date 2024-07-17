class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        return helper(nums);
    }
    
    static List<List<Integer>> helper(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0,end = 0;
        for(int i=0;i<arr.length;i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}