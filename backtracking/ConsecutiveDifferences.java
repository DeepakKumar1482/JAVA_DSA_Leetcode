package backtracking;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveDifferences {
    public static void main(String[] args) {
        numsSameConsecDiff(3,7);
    }
    public static int[] numsSameConsecDiff(int n, int k) {
        List<StringBuilder>list=new ArrayList<>();
        helper(n,k,list,new StringBuilder(),0);
        System.out.println(list);
        return new int[0];
    }
    public static void helper(int n,int k,List<StringBuilder>list,StringBuilder s,int idx){

        if (s.length()==n){
            int c=0;
            if(s.charAt(0)=='0'){
                return;
            }
            for (int j=1;j<s.length();j++){
                if(Math.abs(s.charAt(j)-s.charAt(j-1))==k){
//                    c++;
                }else{
                    c++;
                    break;
                }
            }
//            if(c==0){
                list.add(s);
//                return;
//            }
            return;
        }
        while(idx<=9){
            s.append(idx);
            idx++;
            helper(n,k,list,s,idx);
            s.delete(s.length()-1,s.length());
        }
    }
}
