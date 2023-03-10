class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        //transpose the matrix
        for(int i=0 ; i<r ; i++){
            for(int j=i+1 ; j<c ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row of the matrix
        for(int i=0 ; i<r ; i++){
            int low = 0 , high = c-1;
            while(low<high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
}
