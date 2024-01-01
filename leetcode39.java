import java.util.*;
public class leetcode39 {
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(arr,target));
    }
        static List<List<Integer>>result=new ArrayList();
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            if(candidates.length==0){
                return result;
            }
            combinationSumHelper(candidates,target,0,new ArrayList<Integer>(),0);
            return result;
        }
        public  static void combinationSumHelper(int []candidates,int target,int currsum,List<Integer>sublist,int index){
            if(index>=candidates.length||currsum>target){
                return ;
            }
            if(currsum==target){
                result.add(new ArrayList<>(sublist));
                return;
            }
            for(int i=index;i<candidates.length;i++){
                sublist.add(candidates[i]);
                combinationSumHelper(candidates,target,currsum+candidates[i],sublist,i);
                sublist.remove(sublist.size()-1);
            }
        }
}
