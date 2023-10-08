import java.util.List;
import java.util.Scanner ;

class Solution {

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length ;
        int n = matrix[0].length ;
        int total = 0;
        int topR = 0 , bottomR = m -1 , leftC = 0 , rightC = n - 1 ;
        while(total < m*n){
            for(int j=leftC ; j<=rightC && total < m*n ; j++){
                result.add(matrix[topR][j]) ;
                total++;
            }
            topR++;
            for(int i=topR ; i<=bottomR && total < m*n ; i++){
                result.add(matrix[i][rightC]) ;
                total++;
            }
            rightC--;
            for(int j=rightC ; j>=leftC && total < m*n ; j--){
                result.add(matrix[bottomR][j]) ;
                total++;
            }
            bottomR--;
            for(int i=bottomR ; i>=topR && total < m*n ; i--){
                result.add(matrix[i][leftC]) ;
                total++;
            }
            leftC++;
        }
        return result ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix dimension ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        List<Integer> spiralResult = spiralOrder(arr);
        System.out.println("Spiral Order: " + spiralResult);
    }
}