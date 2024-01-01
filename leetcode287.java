import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode287 {
    public static void main(String[] args) {
        int []arr={3,1,3,4,2};
        Set<Integer>set=new HashSet<>();
        set.add(6);
        set.add(5);
        set.remove(5);
        System.out.println(set);
        System.out.println(set.add(6));
//      int num=  findDuplicate(arr);
//        System.out.println(num);
    }
    public static int findDuplicate(int[] arr){
        String str="";
        str+=Integer.toString(arr[0]);
        str+="-";
        for ( int i=1;i<arr.length;i++){
            if(str.contains(Integer.toString(arr[i]))) {
                return Integer.parseInt(Integer.toString(arr[i]));
            }
            else{
                str+=Integer.toString(arr[i]);
            }
        }

        System.out.println(str);
        return 0;
    }

}
