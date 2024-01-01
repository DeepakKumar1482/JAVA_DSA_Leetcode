public class leetcode2038 {
    public static void main(String[] args) {
        System.out.println(winnerOfGame("AA"));
    }
    public static boolean winnerOfGame(String colors) {
        for (int i=1;i<colors.length()-1;i++){
            if(i%2!=0 && colors.charAt(i-1)!='A' && colors.charAt(i+1)!='A'){
                return false;
            }
            else if(i%2==0 && colors.charAt(i-1)!='B' && colors.charAt(i+1)!='B'){
                return true;
            }
        }
        return true;
    }
}
