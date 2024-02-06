import javax.print.attribute.standard.OrientationRequested;
import java.util.*;

public class treemap {
    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(helper(strs));
        Stack<Integer>s=new Stack<>();

    }
    public static List<List<String>> helper(String []strs){
//        List<String>l=new ArrayList<>();
//        HashMap<String ,ArrayList<String >>map=new HashMap<>();
//        int []frequency=new int[26];
//        for (int i=0;i<strs.length;i++){
//            String curr=strs[i];
//            for (int j=0;j<curr.length();j++){
//                int index=curr.charAt(j)-'a';
//                frequency[index]=frequency[index]+1;
//            }
//            StringBuilder temp=new StringBuilder();
//            for (int k=0;k<26;k++){
//                while (frequency[k]!=0){
//                    temp.append((char)('a'+k));
//                    frequency[k]--;
//                };
//            }
//            String key=temp.toString();
//            if(!map.containsKey(key)){
//                map.put(key,new ArrayList<>());
//            }
//            map.get(key).add(curr);
//        }
//        List<List<String >>list=new ArrayList<>(map.values());
//        System.out.println(list);
//        return list;
        HashMap<String ,List<String>>map=new HashMap<>();
        for (String str:strs){
            char []ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                map.put(key,new ArrayList<>());
                map.get(key).add(str);
            }
        }
        List<List<String>>list=new ArrayList<>(map.values());
        return list;
    }
}
