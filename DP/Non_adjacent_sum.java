package DP;
//In this problem we have given an array with some values and we have to find the maximum sum of array if we can not
//take adjacent elements (you will have to skip element if you have selected the element which present before it)
public class Non_adjacent_sum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 100,5, 6};
        System.out.println(Maximum_Nonadjacent_Sum(arr));
    }
    public static int Maximum_Nonadjacent_Sum(int []arr){
        int n=arr.length;
        int []dp_include=new int[n];
        int []dp_exclude=new int[n];
        dp_include[0]=arr[0];
        dp_exclude[0]=0;
        for (int i=1;i<n;i++){
            dp_include[i]=arr[i]+dp_exclude[i-1];
            dp_exclude[i]=dp_include[i-1];
        }
        return Math.max(dp_include[n - 1], dp_exclude[n - 1]);
    }
}
