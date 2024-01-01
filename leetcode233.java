


public class leetcode233 {

    public static void main(String[] args) {
     int n=13;
        System.out.println(counter(n));
    }
    public static int counter(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            int j=0;
            String s=Integer.toString(i);
           int ind= s.indexOf("1");

            if(ind==0){
                count=count+1;
            }
            if(s.charAt(0)!='1' && ind<0){
//                count
            }
        }
        return count;
    }
}
