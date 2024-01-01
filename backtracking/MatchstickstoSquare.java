package backtracking;

import java.util.ArrayList;

public class MatchstickstoSquare {
    public static void main(String[] args) {
        MatchstickstoSquare m1=new MatchstickstoSquare();
        int [] matchsticks={1,1,2,2,2};
        System.out.println(m1.makesquare(matchsticks));
    }
    public boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int i=0;i<matchsticks.length;i++)  {
            sum+=matchsticks[i];
        }
        if(sum%4!=0){
            return false;
        }
        ArrayList<Integer>list=new ArrayList();
        boolean []check=new boolean[matchsticks.length];
        for(int i=1;i<5;i++){
            helper(matchsticks,list,sum/4,check,0,0);
        }
        int num=0;
        int listsum=0;
        for(int i=0;i<list.size();i++){
            num++;
            listsum+=list.get(i);
        }
        int temp=0;
        int extrasum=0;
        for(int i=0;i<matchsticks.length;i++){
            if(matchsticks[i]!=sum/4){
                extrasum++;
            }
        }
        for(int i=0;i<matchsticks.length;i++){
            if(matchsticks[i]==sum/4){
                temp++;
            }
        }
        if(extrasum==listsum){
            return true;
        }
        return false;
    }
    public void helper(int []matchsticks, ArrayList<Integer>list,int sum,boolean []check,int idx,int s){
        if(s==sum){
            list.add(sum);
//            System.out.println("num");
            return;
        }
        if(idx==matchsticks.length-1){
            return;
        }
        if(!check[idx]){
            s+=matchsticks[idx];
            check[idx]=true;
            idx+=1;
            helper(matchsticks,list,sum,check,idx,s);
            s=s-matchsticks[idx];
            check[idx]=false;
            idx=idx-1;
        }
    }
}
