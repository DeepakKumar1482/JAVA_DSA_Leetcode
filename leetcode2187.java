import java.util.*;
public class leetcode2187 {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(minimumTime(arr,5));
    }
    public static long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        int TTrips=0;
        int Time=1;
        while(TTrips<=totalTrips){
            int i=0;
            TTrips=0;
            while(i<time.length && time[i]<=Time){
                TTrips+=(Time/time[i]);
                if(TTrips==totalTrips){
                    return Time;
                }
                i++;
            }
            Time++;
        }
        return Time;
    }
}
