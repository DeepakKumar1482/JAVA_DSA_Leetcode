public class leetcode392 {
    public static void main(String[] args) {
        System.out.println(issub("abc","ahbgdc"));
    }
    public static boolean issub(String s, String t){
        if(s.length()>t.length()){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int j=0;
        for(int i=0;j<s.length() && i<t.length()  ;i++){
            if(t.charAt(i)==s.charAt(j)){
                // if(j==s.length()-1){
                //     break;
                // }
                j++;
                continue;
            }
        }
        return j==s.length()?true:false;
    }
}
