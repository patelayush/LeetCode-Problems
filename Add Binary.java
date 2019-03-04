class Solution {
    public String addBinary(String a, String b) {
        
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        ArrayList<Character> ch = new ArrayList<>();
        
        if(a.length() > b.length()){
            ca = a.toCharArray();
            cb = b.toCharArray();
        
        }
        else{
            ca = b.toCharArray();
            cb = a.toCharArray();
        }
        int i = ca.length-1;
        int j = cb.length-1;
        int carryover = 0;
        while(i>=0 && j>=0){
            if(carryover == 0){
                int sum = Integer.parseInt(""+ca[i]) + Integer.parseInt(""+cb[j]);
                if(sum == 2){
                    ch.add('0');
                    carryover = 1;
                }else{
                    ch.add(Integer.toString(sum).charAt(0));
                    carryover = 0;
                }
            }
            else{
                int sum = Integer.parseInt("" +ca[i]) + Integer.parseInt(""+cb[j]) + carryover;
                if(sum == 3){
                    ch.add('1');
                    carryover = 1;
                }else if (sum == 2){
                    ch.add('0');
                    carryover = 1;
                }else{
                    ch.add(Integer.toString(sum).charAt(0));
                    carryover = 0;
                }
                
            }   
            i--;
            j--;
        }
        for(int k=ca.length-cb.length-1;k>=0;k--){
            if(carryover == 0){
                ch.add(ca[k]);
            }
            else{
                int s = Integer.parseInt("" + ca[k]) + carryover;
                if(s==2){
                    ch.add('0');
                    carryover = 1;
                }
                else{
                    ch.add(Integer.toString(Integer.parseInt("" + ca[k]) + carryover).charAt(0));
                    carryover = 0;
                }
                
            }
        }
        if(carryover == 1)
            ch.add('1');
        System.out.println(ch);
        String result = "";
        for(int h=ch.size()-1; h>=0;h--){
            result += ch.get(h);
        }
        return result;
    }
}