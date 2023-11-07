package Phase1Module3;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int firstMatrix[][] = new int [][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};    // 123   987
        int secondMatrix[][] =new int [][] {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};   // 456   654 
        int finalresult[][] = new int[3][3];                                         // 789   321

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                	finalresult[i][j] =finalresult[i][j] + (firstMatrix[i][k] * secondMatrix[k][j]);
                }
            }
        }

        for (int[] row : finalresult) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
