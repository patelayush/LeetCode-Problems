class Solution {
    public String countAndSay(int n) {
        String result = "";
        int count = 1; 
        String oldresult;
        int i=3;
        if(n == 1)
            return "1";
        else if(n == 2)
            return "11";
        oldresult = "11";
        while(i <= n){
            result = "";
                char[] str = oldresult.toCharArray();
                for(int k=0; k <str.length; k++){
                    for (int j=k+1; j<str.length;j++){
                        if(str[k] == str[j]){
                            count++;
                        }else{
                            break;
                        }
                        k=j;
                    }
                    result += String.valueOf(count) + str[k];
                    count = 1;                              
                }
                if(i == n){
                    return result;
                }
                oldresult = result;
                i = i+1;
        }
        return null;
    }
}