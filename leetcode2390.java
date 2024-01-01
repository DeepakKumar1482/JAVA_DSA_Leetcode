public class leetcode2390 {
    public static void main(String[] args) {
        String s="erase*****";
        StringBuilder sb=new StringBuilder();
        sb.append("d");
        sb.append("e");
        sb.append("e");
        sb.append("p");
        sb.append("a");
        sb.append("k");
        System.out.println(sb.length());
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s){
        char prev=s.charAt(0);
        StringBuilder sb=new StringBuilder();
        sb.append(prev);
        int j=0;
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)=='*'){
                sb.delete(sb.length()-1,sb.length());
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
