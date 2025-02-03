import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{ //create the class

    public static List<List<Integer>> generate(int numRows){ //We get the int for Number of Rows
        List<List<Integer>> triangle = new ArrayList<>(); //Defining the triangle as an arraylist

    for (int i=0;i<numRows;i++){ //Create our first loop that goes till we reach the number of Rows
        List<Integer>row = new ArrayList<>(); //increment to the next row
        for (int j=0;j<=i;j++){ //Create our second loop that goes till we reach the end of each individual row
        if (j==0 || j==i) row.add(1); //check if we are at the beginning or end of the row and if true put in a 1
        //The reason we need this if statement is because if we tried to use the row below it would be searching for a value that doesn't exist in the triangle as there is only 1 value above each side of the triangle
        else row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j)); //Here we get the values from the previous row and add them together
        }
        triangle.add(row); //Add the finished row to the triangle
    }
    //Return the triangle when done
    return triangle;
    }
}
