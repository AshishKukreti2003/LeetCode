class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        return addDigits(sum(num));
    }
    
    static int sum(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}