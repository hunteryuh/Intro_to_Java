// This Matrix class has a contructor that has already been completed for you.
//
// It takes a int[][] as a parameter and saves it in
// the instance variable, matrix.
//
// Your task is to complete the numberOfColumns method
// to return the number of columns in the matrix

public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
       matrix = array;
    }


    /**
     * Gets the number of columns
     * @return the number of columns
     */
    public int numberOfColumns()
    {
        // TODO: get the number of columns
        return matrix[0].length;
    }
    public int numberOfRows()
    {
        return matrix.length;
    }
    /**
     * Gets the sum of all the even numbers in the matrix
     * @return the sum of all the even numbers
     */
    public int sumOfEvenNumbers()
    {
         // TODO: Return the sum of all the numbers which are even
         int sum = 0;
         for (int i =0; i< matrix.length; i++){
             for (int j = 0; j< matrix[0].length; j++){
                 if(matrix[i][j]%2==0){
                     sum+= matrix[i][j];
                 }
             }
         }
         return sum;
    }
    
    
}
