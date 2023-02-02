class Solution {
    public int strStr(String haystack, String needle) {
        //Method1
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i=0 ; i<haystack.length() - needle.length()+1 ; i++){
            int j=0;
            for( ; j<needle.length() ; j++){
                if(haystack.charAt(i+j) == needle.charAt(j)){
                    continue;
                }
                else{
                    break;
                }
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
        
        //Method2
        /*for(int i=0; i<haystack.size();i++){
           
              if(haystack.substr(i,needle.size())==needle){
              return i;
          
            }
          
       
            return -1;
        }*/
        
        
        //Methos3
        /*return haystack.indexOf(needle);*/
    }
}
