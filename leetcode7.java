public class leetcode7 {
    public static void main(String[] args) {
        long sum=0;
        int x= -2147483412;
        while(x!=0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
      int y=  (int)sum;
        System.out.println();
    }
}
