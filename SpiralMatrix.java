import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix { //declare the class
    public static List<Integer> spiralOrder(int[][] matrix) { //Setting up the matrix by pulling in its length and width
        List<Integer> result = new ArrayList<>(); //defining the array
        int rowStart = 0, rowEnd = matrix.length - 1; //setting up how long the rows are
        int colStart = 0, colEnd = matrix[0].length - 1; //setting up how long the col are

        while (rowStart <= rowEnd && colStart <= colEnd) { //set up the spiral loop
            for (int i = colStart; i <= colEnd; i++) result.add(matrix[rowStart][i]);//Go through a row left to right and add them to the array
            rowStart++; //increment the beginning of the row so that you don't repeat anything the first row

            for (int i = rowStart; i <= rowEnd; i++) result.add(matrix[i][colEnd]);//go through a col up to down and add them to the array
            colEnd--; //increment the end col so that you don't repeat anything from the col again

            if (rowStart <= rowEnd) for (int i = colEnd; i >= colStart; i--) result.add(matrix[rowEnd][i]); //go through a row right to left and add them to the array
            rowEnd--; //increment the end of the row so that it isn't repeated

            if (colStart <= colEnd) for (int i = rowEnd; i >= rowStart; i--) result.add(matrix[i][colStart]); //go through a col down to up and add them to the array
            colStart++; //increment the first column so that this col doesn't get added again
        }
        return result;
    }
}