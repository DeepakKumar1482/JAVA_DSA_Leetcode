package backtracking;

public class palindromicsquence {
    static int ans=0;
    public static void main(String[] args) {
        longestPalindromeSubseq("cbbd",new StringBuilder(""),0);
        System.out.println(ans);
    }
    public static void longestPalindromeSubseq(String s,StringBuilder str,int start) {
        if(start!=0) {
            if(isPalindrome(str.toString())){
                System.out.println(str);
                ans=Math.max(ans,str.length());
            }
        }
        for(int i=start;i<s.length();i++){
            str.append(s.charAt(i));
            longestPalindromeSubseq(s,str,i+1);
            str.deleteCharAt(str.length() - 1);
        }
    }
    public static boolean isPalindrome(String s){
        int j=s.length()-1;
        int count=0;
        for (int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)==s.charAt(j)){
                j--;
                continue;
            }else{
                count++;
                break;
            }
        }
        return count==0?true:false;
    }
}
