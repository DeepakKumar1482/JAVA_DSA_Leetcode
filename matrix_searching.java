//Search the given element in the sorted matrix
//This searching is called stairs search
public class matrix_searching {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        ispresent(matrix,10);
    }
    public static void ispresent(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("The given key is present at ("+row+","+col+") in the given matrix");
                return;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
    }
}
