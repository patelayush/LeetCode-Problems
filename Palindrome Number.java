class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x<10)
            return true;
        char[] ch = String.valueOf(x).toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            if(ch[i]!=ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}