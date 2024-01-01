import java.util.HashMap;

public class leetcode28 {
    public static void main(String[] args) {
        System.out.println(strStr("abc","c"));
    }
    public static int strStr(String haystack, String needle){
        HashMap<String,Integer>map=new HashMap<>();
        int count=needle.length();
        int s=0;
        int e=needle.length();
        for (int i=0;i<haystack.length()-needle.length()+1;i++){
            String str="";
            int j=0;
            while (j<needle.length()){
                str=str+Character.toString(haystack.charAt(i+j));
                j++;
            }
            map.put(str,i);
        }
        return map.containsKey(needle)?map.get(needle):-1;
    }
}
