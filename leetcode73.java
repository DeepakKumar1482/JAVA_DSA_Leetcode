import java.util.ArrayList;
import java.util.Arrays;

public class leetcode73 {
    static class Both{
        int i;
        int j;
        public Both(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public static void main(String[] args) {
        int [][]matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
//    1 0 1
//    0 0 0
//    1 0 1
    public static void setZeroes(int[][] matrix){
        ArrayList<Both>list=new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for ( int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    list.add(new Both(i,j));
                }
            }
        }
        System.out.println("This is the size of list =>"+list.size());
        int lcount=0;
        for (int i=0;i<matrix.length;i++){
            for ( int j=0;j<matrix[0].length;j++){
                if( lcount<list.size() && list.get(lcount).i==i && list.get(lcount).j==j){
                    lcount++;
                    for (int l=j-1;l>=0;l--){
                        matrix[i][l]=0;
                    }
                    for (int r=j+1;r<matrix[0].length;r++){
                        matrix[i][r]=0;
                    }
                    for (int t=i-1;t>=0;t--){
                        matrix[t][j]=0;
                    }
                    for ( int b=i+1;b<matrix.length;b++){
                        matrix[b][j]=0;
                    }
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            for ( int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
