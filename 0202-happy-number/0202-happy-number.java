class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = sumSquare(slow);
            fast = sumSquare(sumSquare(fast));
        }while(slow!=fast);
        if(slow == 1) return true;
        return false;
    }
    
    static int sumSquare(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}