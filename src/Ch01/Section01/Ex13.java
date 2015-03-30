package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex13 {
    public static int[][] Transpose(int[][] matrix){
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        int[][] tmpMatrix = new int[columnCount][rowCount];

        for(int i = 0; i < rowCount; i++)
            for(int j = 0; j < columnCount; j++)
                tmpMatrix[j][i] = matrix[i][j];

        return tmpMatrix;
    }
    public static void PrintMatrix(int[][] matrix){
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;

        for (int i=0; i < rowCount; i++){
            for (int j =0; j < columnCount; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Test(){
        int[][] matrix = new int[][]{
                {5, 7, 8, 9},
                {4, 45, 21, 35}
        };
        int[][] transposedMatrix = Transpose(matrix);
        PrintMatrix(transposedMatrix);
    }
}
