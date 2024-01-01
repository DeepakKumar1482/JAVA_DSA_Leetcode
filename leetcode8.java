public class leetcode8 {
    public static void main(String[] args) {
        String str="49";
        int a='-';
        System.out.println(a);
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                sum=sum*10+((int)str.charAt(i)-'0');
//                System.out.println((int)str.charAt(i));
//                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
