import java.util.Arrays;

public class matrixarray {
    public static void main(String[] args) {
        int[][] lists ={{1,4,5},{1,4,3},{2,6}};
//                lists = [[1,4,5],[1,3,4],[2,6]]
//        Arrays.sort(lists);
        for(int i=0;i<lists.length;i++){
            for(int j=0;j<lists[i].length;j++){
                System.out.print(lists[i][j]+" ");
            }
        }
    }
}
