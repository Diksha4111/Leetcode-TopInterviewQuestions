class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        for(int i=0 ; i<s.length() ; i++){
            char ele = s.charAt(i);
            if(ele != '#'){
                s1.push(ele);
            }
            else if(!s1.isEmpty()){
                s1.pop();
            }
        }
        for(int i=0 ; i<t.length() ; i++){
            char ele = t.charAt(i);
            if(ele != '#'){
                s2.push(ele);
            }
            else if(!s2.isEmpty()){
                s2.pop();
            }
        }
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop()!=s2.pop()){
                return false;
            }
        }
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        return false;
    }
}
