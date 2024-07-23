class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> lucky = new ArrayList<>() ;
        int m = matrix.length ;
        int n = matrix[0].length ;
        
        for(int i=0 ; i<m ; i++){
            int min = -1 ;
            int minNum = Integer.MAX_VALUE ;
            for(int j=0 ; j<n ; j++){
                if(matrix[i][j] < minNum){
                    min = j;
                    minNum = matrix[i][j] ;
                }
            }
            int k = (i+1)%m ;
            boolean special = true ;
            while(k!=i){
                if(matrix[k][min] > matrix[i][min]){
                    special = false ;
                }
                k = (k+1)%m ;
            }
            if(special){
                lucky.add(matrix[i][min]);
            }
        }
        return lucky ; 
        
    }
}