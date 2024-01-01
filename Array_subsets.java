import java.util.ArrayList;
import java.util.List;

public class Array_subsets {
    public static void main(String[] args) {
        int []arr={1,2,3};Subsets(arr);
    }
    public static void Subsets(int []arr){
        ArrayList<List<Integer>>l=new ArrayList<>();
        int total_subsets=(int)Math.pow(2,arr.length);
        for(int i=0;i<total_subsets;i++){
            int temp=i;
            List<Integer>s=new ArrayList<>();
            for(int j=arr.length-1;j>=0;j--){
                int rem=temp%2;
                temp=temp/2;
                if(rem!=0){
                    s.add(arr[j]);
                }
            }
            l.add(s);
        }
        System.out.println(l);
    }
}
