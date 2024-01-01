public class leetcode844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("xywrrmp","xywrrmu#p"));
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == '#') {
                ans1.deleteCharAt(ans1.length() - 1);
            } else {
                ans1.append(s.charAt(i));
            }
            if (i > 0 && t.charAt(i) == '#') {
                ans2.deleteCharAt(ans2.length() - 1);
            } else {
                ans2.append(t.charAt(i));
            }
        }
        System.out.println("This is ans1 =>" + ans1 + "hyy");
        System.out.println("This is ans2=>" + ans2 + "hyy");
        s = ans1.toString();
        t = ans2.toString();
        int count = 0;
        if (s.length() != t.length()) {
            return false;
        }
//        else{
//            for (int i=0;i<s.length();i++){
//                if(s.charAt(i)==t.charAt(i)){
//                    count++;
//                    continue;
//                }else{
//                    return false;
//                }
//            }
//    }
        s=ans1.toString();
        t=ans2.toString();
        return s.equals(t);
    }
}
