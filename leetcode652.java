import java.util.HashMap;

public class leetcode652 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c' };
//        System.out.println(ch);
        counter(chars);
    }
    public  static void counter(char s[]){
        HashMap<Character,Character>map=new HashMap<>();
        map.put(s[0],(char)49);
//        for(int i=1;i<s.length;i++){
//           map.put(s[i],i);
//        }
//        if(map.size()==s.length){
//            return s.length;
//        }
//        return map.size()*2;
        for(int i=1;i<s.length;i++){
            if(map.containsKey(s[i])) {
                map.put(s[i],(char) (map.get(s[i])+1));
            }
            else {
                map.put(s[i],(char)49 );
            }
        }
        for (char a:map.keySet()) {
            System.out.println(a);
        }
        System.out.println(map);
    }
}
