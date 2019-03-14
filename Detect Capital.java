class Solution {
    public boolean detectCapitalUse(String word) {
        int capital_count = 0, small_count = 0;
        if(word.length() == 0)
            return true;
        char[] ch = word.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(Character.isUpperCase(ch[i]))
                capital_count++;
            else
                small_count++;
            
        }
        if(capital_count == ch.length)
            return true;
        else if (Character.isUpperCase(ch[0]) && capital_count == 1)
            return true;
        
        if(small_count == ch.length)
            return true;
        return false;
        
    }
}