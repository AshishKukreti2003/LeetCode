class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int first = 0;
        int last = 1;
        for(int i=1;i<n;i++){
            int sum = first + last;
            first = last;
            last = sum;
        }
        return last;
    }
}