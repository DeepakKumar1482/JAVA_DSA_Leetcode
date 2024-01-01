public class leetcode1870 {
    public static void main(String[] args) {
        int []arr={1,3,2};
        System.out.println(minSpeedOnTime(arr,2.7));
    }
    public static int minSpeedOnTime(int[] dist, double hour) {
        int start=1;
        int end=(int)10e7+9;
        while (start<end){
            int mid=start+(end-start)/2;
            double time=0;
            for (int i=0;i<dist.length;i++){
                if(time>(int)time){
                    time=(double) (int)time+1;
                }
                time+=(double) dist[i]/(double)mid;
            }
            if (time>hour){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start>10e7?-1:start;
    }
}
