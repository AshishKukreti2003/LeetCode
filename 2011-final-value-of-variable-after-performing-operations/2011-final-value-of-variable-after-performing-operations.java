class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                count--;
            }else if(operations[i].equals("X++") || operations[i] .equals("++X")){
                count++;    
            }
        }
        return count;
    }
}