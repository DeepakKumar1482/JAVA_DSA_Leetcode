import java.util.Arrays;

public class leetcode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
    public static String reverseWords(String s) {
      String []arr= s.split(" ",s.length()-1);
//        System.out.println(Arrays.toString(arr));
        StringBuilder ans=new StringBuilder();
        for (int i=arr.length-1;i>=0;i--){
            if(arr[i]!="") {
                ans.append(arr[i]);
                ans.append(" ");
            }
        }
        ans.deleteCharAt(ans.length()-1);
//        System.out.print(ans);
        return ans.toString();
    }
}
