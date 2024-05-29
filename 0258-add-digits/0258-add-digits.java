class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        return 1+(num-1)%9;
    }
}