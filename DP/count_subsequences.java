package DP;

public class count_subsequences {
    public static void main(String[] args) {
        System.out.println(subsequences("abcabc"));
    }
    public static int subsequences(String str){
        int a=0;
        int ab=0;
        int abc=0;
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (c=='a'){
                a=2*a+1;
            }
            else if(c=='b'){
                ab=2*ab+a;
            }
            else if(c=='c') {
                abc = 2 * abc + ab;
            }
        }
        return abc;
    }
}

