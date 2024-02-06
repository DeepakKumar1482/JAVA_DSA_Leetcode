import java.util.ArrayList;
import java.util.List;

public class leetcode1291 {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(100,300));
    }
    static public List<Integer> sequentialDigits(int low, int high) {
        int []arr={12,123,1234,12345,123456,1234567,123456789};
        List<Integer>list=new ArrayList();
        int digits= (int) Math.log10(low)+1;
        int ans=arr[digits-2];
        list.add(ans);
        while(ans<=high){
            if(!list.isEmpty() && helper(list.get(list.size()-1),ans,digits)){
                list.add(ans);
            }
            int num=0;
            if(!list.isEmpty()){
                num=list.get(list.size()-1);
            }
            digits= (int) Math.log10(num)+1;
            int hunderds=(int)Math.pow(10,digits);
            int elevens=(int)(.111111111*hunderds);
            ans+=elevens;
        }
        return list;
    }
    static boolean helper(int peek,int number,int digits) {
        int sum=0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return (sum-peek)==digits?true:false;
    }
}
