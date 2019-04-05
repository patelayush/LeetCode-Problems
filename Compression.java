class Solution {
    public int compress(char[] chars) {
        if(chars.length == 0 || chars.length == 1)
            return chars.length;
        String res = chars[0] +"";
        int count = 1;
        for(int i=0;i<chars.length; i++){
            if(i != chars.length-1 && chars[i] == chars[i+1])
                count++;
            else{
                if(count!=1)
                    res += count;
                count = 1;
                if(i!=chars.length-1)
                    res+=chars[i+1];
                }
        }
        
       for(int i=0; i<res.length();i++){
           chars[i] = res.charAt(i);
       }
        return res.length();
    }
}