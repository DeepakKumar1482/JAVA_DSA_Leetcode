package Tutioln.date18;

import java.util.Map;

public class contianer {
    public static void main(String[] args) {
//        {1,2,3,2,1,2};
//        target=2;
        int []height={1,8,6,2,5,4,8,3,7};
        int ans=MaxArea(height);
        System.out.println(ans);
    }
    public static int MaxArea(int []height){
        int low=0;
        int min=Integer.MAX_VALUE;
        int high=height.length-1;
        for (int i=0;i<height.length;i++) {
            int area = (high - low) * Math.min(height[low], height[high]);
            min=Math.min(min,area);
            if(height[low]>height[high]){
                low++;
            }
            else {
                high--;
            }
        }
        return min;
    }
}
