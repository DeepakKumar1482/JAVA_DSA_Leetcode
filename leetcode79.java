import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class leetcode79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int []arr={54,546,548,60};
        List<List<Integer>>l=new ArrayList<>();
        helper(arr,0,new ArrayList<>(),l);
        System.out.println(l);
        long max=0;
        for (int i=0;i<l.size();i++){
            StringBuilder ans=new StringBuilder();
            for (int j=0;j<l.get(i).size();j++){
                ans.append(l.get(i).get(j));
            }
            long com=Long.parseLong(ans.toString());
            if(com>max){
                max = com;
            }
        }
        System.out.println(max);
    }
    public static void helper(int []arr,int ind,ArrayList<Integer>list,List<List<Integer>>l){
        if(ind==arr.length){
            l.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<arr.length;i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
                helper(arr, ind + 1, list, l);
                list.remove(list.size() - 1);
            }
        }
    }
}
