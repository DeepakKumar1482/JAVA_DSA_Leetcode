import java.util.ArrayList;

public class leetcode880 {
    public static void main(String[] args) {
        System.out.println(decodeAtIndex("leet2code3",10));
    }
    public static String decodeAtIndex(String s, int k) {
        ArrayList<String>list=new ArrayList<>();
        String add="";
        for (int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int digit=s.charAt(i)-'0';
                list.add(add);
                for (int j=0;j<digit-1;j++){
                    String curr="";
                    for (int l=0;l<list.size();l++){
                        curr+=list.get(l);
                    }
                    list.add(curr);
                }
            }else{
               add+=s.charAt(i);
            }
        }
        System.out.println(list);
        return "o";
    }
}
