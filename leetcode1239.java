import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode1239 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
//        list.add("ue");
        System.out.println(maxLength(list));
    }
    public static int maxLength(List<String> arr) {
        int maxlen=0;
        for(int i=0;i<arr.size();i++){
            String str=new String();
            for(int j=i;j<arr.size();j++){
                str+=arr.get(j);
            }
            int temp=0;
            HashMap<Character,Integer>map=new HashMap<>();
            for (char ch:str.toCharArray()){
                if(map.containsKey(ch)){
                    temp++;
                    break;
                }else{
                    map.put(ch,1);
                }
            }
            if(temp==0 && maxlen<str.length()){
                maxlen=str.length();
            }
        }
        return maxlen;
//        int maxlen=0;
//        for(int i=0;i<arr.size();i++) {
//            boolean[] freq = new boolean[26];
//            String str = "";
//            for (int j = i ; j < arr.size(); j++) {
//                for (char ch : arr.get(j).toCharArray()) {
//                    int idx = ch - 'a';
//                    if (freq[idx]) {  
//                        break;
//                    } else {
//                        str += Character.toString(ch);
//                        freq[idx] = true;
//                    }
//                }
//                if (str.length() > maxlen) {
//                    maxlen = str.length();
//                }
//            }
//        }
//        return maxlen;
    }
}
