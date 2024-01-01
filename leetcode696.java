public class leetcode696 {
    public static void main(String[] args) {
        String str="00110011";
        System.out.println(countBinarySubstrings(str));
    }
    public static int countBinarySubstrings(String s) {
        int count=0;
        int curr=1;
        int prev=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                count+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
        return count+=Math.min(curr,prev);
    }
}
