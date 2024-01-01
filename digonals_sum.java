public class digonals_sum {
    public static void main(String[] args) {
        int matrix[][]={{10,2,3},{4,15,6},{7,8,19}};
        System.out.println("The sum of primary digonal is = "+primarydigonal(matrix));
        System.out.println("The sum of secondary digonal is = "+secondarydigonal(matrix));
    }
    public static int primarydigonal(int matrix[][]){
        int sum =0;
        for ( int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
        }
        return sum;
    }
    public static  int secondarydigonal(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        for ( int i=0;i<n;i++){
           sum+=matrix[i][n-1-i];
        }
        return sum;
    }
}
