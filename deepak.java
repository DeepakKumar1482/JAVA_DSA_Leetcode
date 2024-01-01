import java.util.HashMap;

public class deepak {
    public static void main(String[] args) {
        String str="a";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
        int len=s.length();
        int count=0;
        for (int i=len-1;i>=0;i--){
            if(count==0 && s.charAt(i)==' '  ){
                continue;
            }
            else{
                count++;
                if(s.charAt(i)==' '){
                    break;
                }
            }
        }
        return count;
    }

}

