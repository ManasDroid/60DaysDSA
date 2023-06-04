package Day1;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

        int mat[][] = {{7,19,3},{4,21,0}};
        print2D(mat);
        setZeros(mat);
        System.out.println("******************");
        print2D(mat);
    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
    public static void setZeros(int matrix[][]) {
        int col0 =1, rows = matrix.length, cols = matrix[0].length;

        for(int i = 0; i<rows; i++){
            if(matrix[i][0] == 0) col0 = 0;

            for(int j=1; j<cols; j++){
                if(matrix[i][j]==0)
                    matrix[0][j] = matrix[i][0] = 0;
            }
        }
        for(int i = rows-1; i>=0; i--){
            for(int j=cols-1; j>=1; j--){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
            if(col0 == 0)matrix[i][0] = 0;

        }
    }
}
