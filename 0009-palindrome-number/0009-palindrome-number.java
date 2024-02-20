class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        int a;
        while(x>0){
            a = x%10;
            rev= rev*10+a;
            x/=10;
        }
        if(rev == org){
            return true;
        }
        else{
            return false;
        }
    }
}