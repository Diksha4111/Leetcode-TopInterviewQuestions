class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        StringBuilder x = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0 ; i<s.length() ; i++){
            char ele = s.charAt(i);
            if(Character.isLetter(ele) || Character.isDigit(ele)){
                x.append(ele);
            }
        }
        int n = x.length()-1;
        for(int i=0 ; i<x.length()/2 ; i++){
            if(x.charAt(i) != x.charAt(n-i)){
                return false;
            }
        }
        return true;
        
    }
}
