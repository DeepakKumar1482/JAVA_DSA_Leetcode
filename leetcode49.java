import java.util.ArrayList;
import java.util.List;

public class leetcode49 {
    public static void main(String[] args) {
        String []arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        for (int i=0;i<strs.length;i++){
            List<String>s=new ArrayList<>();
            if (strs[i]!="@") {
                s.add(strs[i]);
            }
            if(strs[i]!="@") {
                for (int j = i + 1; j < strs.length; j++) {
                    int c = 0;
                    for (int k = 0; k < strs[i].length(); k++) {
                        if (strs[j] != "@" && strs[j].contains(Character.toString(strs[i].charAt(k)))) {
                            continue;
                        } else {
                            c++;
                        }
                    }
                    if (c == 0 && strs[j] != "@") {
                        s.add(strs[j]);
                        strs[j] = "@";
                    }
                }
            }
            if(!s.isEmpty()) {
                list.add(s);
            }
        }
        return list;
    }
}
