class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 9){
                while(nums[i]>0){
                    Stack<Integer> stack = new Stack<>();
                    while(nums[i] > 0){
                        stack.push(nums[i]%10);
                        nums[i]/=10;
                    }
                    while(!stack.isEmpty()){
                        list.add(stack.pop());
                    }
                }
            }else{
                list.add(nums[i]);
            }
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}