class Solution {
    public int fib(int N) {
        int first,second, third = 0;
        if(N == 0)
            return 0;
        else if(N == 1 || N == 2){
            return 1;
        }
        first = 0;
        second = 1;
        for(int i = 1; i<N; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}