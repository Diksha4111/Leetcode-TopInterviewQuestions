class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                char item = board[i][j];
                if(item != '.'){
                    if(!set.add("row"+i+item) || !set.add("col"+j+item)){
                        return false;
                    }
                    if(!set.add("box"+(i/3)*3+(j/3)+item)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
