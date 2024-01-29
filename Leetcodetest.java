import java.util.HashMap;

public class Leetcodetest {
    public static void main(String[] args) {
        int [][]nums={{6,5},
                {8,8},
                {2,10},
                {8,1},
                {9,2},
                {3,5},
                {3,5}
        };
        System.out.println(areaOfMaxDiagonal(nums));
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int maxans=0;
        double maxdim=0;
        for(int i=0;i<dimensions.length;i++){
            int first=dimensions[i][0];
            int second=dimensions[i][1];
            double dig=Math.sqrt(first*first+second*second);
            if(dig>=maxdim){
                if(first*second>maxans){
                    maxans=first*second;
                    maxdim=dig;
                }
            }
        }
        return maxans;
    }
}
