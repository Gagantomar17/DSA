class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length ;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }

        for(int i=0 ; i<n ; i++){
            int j1 = 0 ;
            int j2 = matrix.length-1;
            while(j1<j2){
                int temp = matrix[i][j1];
                matrix[i][j1] = matrix[i][j2];
                matrix[i][j2] = temp ;
                j1++;
                j2--;
            }
        }
        
    }
}