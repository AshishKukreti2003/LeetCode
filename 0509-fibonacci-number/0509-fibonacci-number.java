class Solution {
    public int fib(int n) {
        return fibo(n);
    }
    
    static int fibo(int n){
        if(n == 0){
            return 0; 
        }
        if(n <= 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}