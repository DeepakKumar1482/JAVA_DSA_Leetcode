//this code is the implementation of sliding window method and we
// are gonna find the maximum sum of three length sub arrays

//In this method we first make the sub array of length given and then
//we will slide the sub array means we will minus the value of the starting indexes and will increase the ending index
package sliding_window_method;
public class sliding_window {
    public static void main(String[] args) {
        int num[]={1,13,2,5,6};
        int k=3;
        System.out.println(maximumsum(num,k));
    }
    public static int maximumsum(int num[],int k){
//        int end=0;
//        int maxsum=Integer.MIN_VALUE;
//        int start=0;
//        int windowsum=0;
//        for(int end=0;end<num.length;end++){
//              windowsum+=num[end];
//              if(end>=k-1){
//                  maxsum=Math.max(maxsum,windowsum);
//                  windowsum=windowsum-num[start];
//                  start++;
//              }
//        }
//        return maxsum;
        int maxsum=Integer.MIN_VALUE;
//        int end=0;
        int start=0;
        int windowsum=0;
        for(int end=0;end<num.length;end++){
            windowsum=windowsum+num[end];
            if(end>=k-1){
                maxsum=Math.max(windowsum,maxsum);
                windowsum=windowsum-num[start];
                start++;
            }
        }
        return maxsum;
    }
}
