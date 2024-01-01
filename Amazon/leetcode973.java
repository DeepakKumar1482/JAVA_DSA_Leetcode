//K closest points to the origin
package Amazon;

import java.util.*;

public class leetcode973 {
    public static void main(String[] args) {
        int nums[][] = {
                        {2, 1},
                        {1,0}
        };
        kClosest(nums,2);
    }
    public static void kClosest(int[][] points, int k) {
        int min=Integer.MAX_VALUE;
        TreeMap<Integer,Float> map=new TreeMap<>();
        int ans[][]=new int[k][2];
        for (int i=0;i<points.length;i++){
            float cal= (float) Math.sqrt((int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2));
            map.put(i,cal);
        }
        System.out.println(map);
        int temp=0;
        int i=0;
        for (int a:map.keySet()) {
            if(temp<=k) {
                for (int j = 0; j < 2; j++) {
                    ans[i][j] = points[a][j];
                    temp++;
                }
                i++;
            }
        }
        for (int l=0;l<ans.length;l++){
            for (int m=0;m<ans[0].length;m++){
                System.out.println(ans[l][m]);
            }
        }

    }
}
