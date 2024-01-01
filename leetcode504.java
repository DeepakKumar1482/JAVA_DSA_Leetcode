public class leetcode504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }
    public static String convertToBase7(int num) {
        String ans="";
        int sign=1;
        if(num<0){
            sign=-1;
           num= Math.abs(num);
        }
        while(num>0){
            ans=ans+Integer.toString(num%7);
            num=num/7;
        }
        StringBuilder str=new StringBuilder(ans);
        str.reverse();
        ans= String.valueOf(str);
        int number=0;
        if(!ans.isEmpty())
            number=Integer.parseInt(ans);
        number= number*sign;
        return Integer.toString(number);
    }
}
