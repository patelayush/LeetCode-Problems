class Solution {
    public int reverse(int x) {
        int digits = 0;
        int nums = x;
        int result = 0;
        while(nums/10 !=0){
            nums = nums/10;
            digits++;
        }
        while(digits>=0){
            int mod = x%10;
            result += mod * (Math.pow(10,digits));
            if((result >=(Math.pow(2,31) - 1) || result <=(Math.pow(-2,31) + 1)))
                return 0;
            System.out.println(Math.pow(2,31));
            digits--;
            x = x/10;
        }
        System.out.print(result);
        return result;
    }
}