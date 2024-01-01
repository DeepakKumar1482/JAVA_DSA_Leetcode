import java.util.List;
import java.util.ArrayList;
public class leetcode40 {
    public static void main(String[] args) {
        int []candidates={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>>list=new ArrayList();
        List<Integer>l=new ArrayList();
        helper(candidates,target,list,l,0,0,new boolean[candidates.length]);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
    public static void helper(int []can,int target,List<List<Integer>>list,List<Integer>l,int sum,int ind,boolean[]ex){
        if(sum==target){
            list.add(new ArrayList(l));
            sum=0;
            return;
        }
        for(int i=ind;i<can.length;i++){
            sum+=can[i];
            l.add(can[i]);
            if(!ex[i]) {
                ex[i]=true;
                helper(can, target, list, l, sum, ind + 1, ex);
                ex[i]=false;
                int last=l.get(l.size()-1);
                sum=sum-last;
                l.remove(l.size()-1);
            }
        }
    }
}
